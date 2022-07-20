package com.quadvision.anydel.backend.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.quadvision.anydel.backend.R


import timber.log.Timber

object ImageUtil {
    private const val LARGE_IMAGE_WIDTH = 640
    private const val LARGE_IMAGE_HEIGHT = 320



    fun loadImage(
        ctx: Context?,
        imageUrl: String?,
        appCompatImageView: AppCompatImageView?,
        circularTransformation: Boolean
    ) {
        try {

            if (appCompatImageView != null && ctx != null) {
                var apiToken = SecuredSharePreferenceUtil.getStringData(
                    SecuredSharePreferenceUtil.API_TOKEN,
                    null
                )

                val glideUrl = GlideUrl(
                    imageUrl,
                    LazyHeaders.Builder()
                        .addHeader("X-COM-API-KEY", "QuadAdlaPP2021api#")
                        .addHeader("Authorization", "Basic YXBwZGVsdXNyOkN1c3RhZGxhcHBAMDk=")
                        .addHeader("X-COM-TOKEN-KEY", apiToken!!)
                        .build()
                )

                Glide.with(ctx).load(glideUrl)
                    .apply(if (circularTransformation) circularOptions else options)
                    .listener(object : RequestListener<Drawable?> {
                        override fun onLoadFailed(
                            e: GlideException?,
                            model: Any,
                            target: Target<Drawable?>,
                            isFirstResource: Boolean
                        ): Boolean {
                            if (e != null) {
                                val exceptionList = e.rootCauses
                                if (exceptionList.size > 0) {
                                    val errorMsg = exceptionList[0].message
                                }
                            }
                            return false
                        }

                        override fun onResourceReady(
                            resource: Drawable?,
                            model: Any,
                            target: Target<Drawable?>,
                            dataSource: DataSource,
                            isFirstResource: Boolean
                        ): Boolean {
                            return false
                        }
                    })
                    .into(appCompatImageView)
            }
        } catch (e: Throwable) {
                Timber.e("Exception caught while loading image ==>> " + e.message)
        }
    }



    private val circularOptions: RequestOptions = RequestOptions()
        .placeholder(R.drawable.glide_circular_holder_bg)
        .transform(CircleCrop())
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .error(R.drawable.ic_default_user)

    private val options: RequestOptions = RequestOptions()
        .placeholder(R.drawable.glide_rectangle_holder_bg)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .override(
            LARGE_IMAGE_WIDTH,
            LARGE_IMAGE_HEIGHT
        )
        .error(R.drawable.ic_image_placeholder)

}