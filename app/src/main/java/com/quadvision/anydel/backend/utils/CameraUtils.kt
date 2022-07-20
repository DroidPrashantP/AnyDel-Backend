package com.quadvision.anydel.backend.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.media.MediaScannerConnection
import android.net.Uri
import android.os.Parcelable
import android.provider.MediaStore
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import java.io.File
import java.util.*

object CameraUtils {

    fun getCameraIntentToLaunch(@NonNull context: Context): Intent {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, getCaptureImageOutputUri(context, cameraIntent))
        return cameraIntent
    }

    /**
     * Get URI to image received from capture  by camera.
     *
     * @param context      current context
     * @param cameraIntent camera intent to launch
     * @return output uri
     */
    fun getCaptureImageOutputUri(context: Context, cameraIntent: Intent?): Uri? {
        var outputFileUri: Uri? = null
        val getImage = context.externalCacheDir
        if (getImage != null) {
            outputFileUri = FileProvider.getUriForFile(
                context,
                context.applicationContext.packageName + ".provider",
                File(getImage.path, "pickImageResult.jpeg")
            )
        }
        val resInfoList = context.packageManager.queryIntentActivities(
            cameraIntent!!, PackageManager.MATCH_DEFAULT_ONLY
        )
        for (resolveInfo in resInfoList) {
            val packageName = resolveInfo.activityInfo.packageName
            context.grantUriPermission(
                packageName,
                outputFileUri,
                Intent.FLAG_GRANT_WRITE_URI_PERMISSION or Intent.FLAG_GRANT_READ_URI_PERMISSION
            )
        }
        return outputFileUri
    }

    /**
     * Start crop image activity for the given image.
     */
    fun startCropImageActivity(context: Context?, imageUri: Uri?) {
        CropImage.activity(imageUri)
            .setGuidelines(CropImageView.Guidelines.ON)
            .setMultiTouchEnabled(true)
            .start((context as AppCompatActivity?)!!)
    }

    /**
     * Refreshes gallery on adding new image/video. Gallery won't be refreshed
     * on older devices until device is rebooted
     */
    fun refreshGallery(context: Context?, filePath: String) {
        // ScanFile so it will be appeared on Gallery
        MediaScannerConnection.scanFile(
            context, arrayOf(filePath), null
        ) { path: String?, uri: Uri? -> }
    }

    fun openImagePickerChooser(context: Context) {
        (context as Activity).startActivityForResult(
            getPickImageChooserIntent(context),
            CropImage.PICK_IMAGE_CHOOSER_REQUEST_CODE
        )
    }

    fun getPickImageChooserIntent(context: Context): Intent? {
        val allIntents: MutableList<Intent> = ArrayList()
        val packageManager = context.packageManager
        allIntents.add(getCameraIntentToLaunch(context))
        var galleryIntents =
            CropImage.getGalleryIntents(packageManager, Intent.ACTION_GET_CONTENT, false)
        if (galleryIntents.size == 0) {
            // if no intents found for get-content try pick intent action (Huawei P9).
            galleryIntents = CropImage.getGalleryIntents(packageManager, Intent.ACTION_PICK, false)
        }
        allIntents.addAll(galleryIntents)
        val target: Intent
        if (allIntents.isEmpty()) {
            target = Intent()
        } else {
            target = allIntents[allIntents.size - 1]
            allIntents.removeAt(allIntents.size - 1)
        }

        // Create a chooser from the main  intent
        val chooserIntent = Intent.createChooser(target, "Select Source")

        // Add all other intents
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, allIntents.toTypedArray<Parcelable>())
        return chooserIntent
    }
}