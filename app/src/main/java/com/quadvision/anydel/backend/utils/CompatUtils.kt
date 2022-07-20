package com.quadvision.anydel.backend.utils

import android.R
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.util.DisplayMetrics
import android.view.View
import timber.log.Timber

object CompatUtils {

    fun getColorStateListWithStateEnabled(primaryColor: Int, disableColor: Int): ColorStateList? {
        return ColorStateList(
            arrayOf(intArrayOf(-R.attr.state_enabled), intArrayOf(R.attr.state_enabled)),
            intArrayOf(
                disableColor,
                primaryColor
            )
        )
    }


    fun createCustomBtnDrawable(
        context: Context?,
        v: View,
        backgroundColor: ColorStateList?,
        borderColor: ColorStateList?
    ) {
        try {
            context?.let {
                val shape = GradientDrawable()
                shape.shape = GradientDrawable.RECTANGLE
                val rd: Int = dpToPx(it, 8)
                shape.cornerRadii = floatArrayOf(
                    rd.toFloat(),
                    rd.toFloat(),
                    rd.toFloat(),
                    rd.toFloat(),
                    rd.toFloat(),
                    rd.toFloat(),
                    rd.toFloat(),
                    rd.toFloat()
                )
                shape.color = backgroundColor
                shape.setStroke(1, borderColor)
                v.background = shape
            }

        } catch (e: Exception) {
                Timber.e("Exception caught in createCustomBtnDrawable :%s", e.message)
        }
    }

    fun dpToPx(context: Context, dp: Int): Int {
        val displayMetrics = context.resources.displayMetrics
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
    }

}