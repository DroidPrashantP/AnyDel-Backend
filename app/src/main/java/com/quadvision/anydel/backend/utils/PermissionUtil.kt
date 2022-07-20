package com.quadvision.anydel.backend.utils

import android.Manifest
import android.app.Activity
import androidx.core.app.ActivityCompat

object PermissionUtil {
    const val COARSE_LOCATION_PERMISSION_REQUEST_CODE = 7
    const val PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1
    const val PERMISSIONS_REQUEST_CAMERA = 2
    const val PERMISSIONS_REQUEST_EXTERNAL_STORAGE = 3
    const val PERMISSIONS_REQUEST_PHONE_CALL= 4

    fun requestPermissionForCoarseLocation(activity: Activity?) {
        ActivityCompat.requestPermissions(activity!!, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION), COARSE_LOCATION_PERMISSION_REQUEST_CODE)
    }

    fun requestPermissionForFineLocation(activity: Activity?) {
        ActivityCompat.requestPermissions(activity!!, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION)
    }

    fun requestExternalStoragePermission(activity: Activity?) {
        activity?.let {
            ActivityCompat.requestPermissions(
                it,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                PERMISSIONS_REQUEST_EXTERNAL_STORAGE
            )
        }
    }

    fun requestCameraPermission(activity: Activity?) {
        activity?.let {
            ActivityCompat.requestPermissions(
               it,
                arrayOf(Manifest.permission.CAMERA),
                PERMISSIONS_REQUEST_CAMERA
            )
        }
    }
}