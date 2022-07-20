package com.quadvision.anydel.backend.utils

import android.content.Context
import android.text.Editable
import android.text.Selection
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.TextWatcher
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar


fun String?.isNotNullOrEmpty(): Boolean {
    return this != null && this.isNotEmpty()
}

fun <K, V> Map<out K, V>?.isMapNotEmpty(): Boolean {
    return this != null && this.isNotEmpty()
}

fun <E> Collection<E>?.isListNotEmpty(): Boolean {
    return this != null && this.isNotEmpty()
}

fun String?.getValue(): String? {
    return if (this.isNotNullOrEmpty()) {
        this
    } else {
        null
    }
}

fun String?.strToInt(): Int {
    try {
        return if (this.isNotNullOrEmpty()) {
            this!!.toInt()
        } else {
            0
        }
    } catch (e: NumberFormatException) {
        println("$e")
    }
    return 0
}

fun String.appendZero(): String {
    return if (this.length == 1) {
        "0".plus(this)
    } else {
        this
    }
}

fun String?.getTimeFormat(): String {
    var formattedTime: String? = null
    try {
        formattedTime = this?.replace(":", "")
        formattedTime = formattedTime?.replace("PM", "")
        formattedTime = formattedTime?.replace("AM", "")
    } catch (e: NumberFormatException) {
        println("$e")
    }
    return formattedTime!!
}

fun Editable?.getValue(): String {
    return if (this.isNullOrEmpty()) {
        ""
    } else {
        this.toString()
    }
}


fun String?.getMobileNumber(): String? {
    return if (this.isNotNullOrEmpty()) {
        if (this?.length == 11) {
            this.drop(0)
        } else {
            this
        }
    } else {
        null
    }
}

fun String?.appendZeroToMobileNumber(): String {
    return if (this.isNotNullOrEmpty()) {
        if (this?.length == 11) {
            this
        } else {
            "0".plus(this)
        }
    } else {
        ""
    }
}

fun String?.removeZeroToMobileNumber(): String {
    return if (this.isNotNullOrEmpty()) {
        if (this?.length == 11) {
            this.subSequence(1, 11).toString()
        } else {
            "0".plus(this)
        }
    } else {
        ""
    }
}

fun String?.appendZeroToHourOrMinute(): String? {
    return if (this.isNotNullOrEmpty()) {
        if (this?.length == 1) {
            "0".plus(this)
        } else {
            this
        }
    } else {
        null
    }
}


fun Boolean?.isNotNullAndTrue(): Boolean {
    return this != null && this
}

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun CoordinatorLayout.showSnackBarMsg(msg: String?) {
    msg?.let { Snackbar.make(this, it, Snackbar.LENGTH_LONG).show() }
}

fun AppCompatTextView.leftDrawable(@DrawableRes id: Int = 0) {
    this.setCompoundDrawablesWithIntrinsicBounds(id, 0, 0, 0)
}

/**
 * Extension function to simplify setting an afterTextChanged action to EditText components.
 */
fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    })
}

fun AppCompatTextView.makeLinks(vararg links: Pair<String, View.OnClickListener>) {
    val spannableString = SpannableString(this.text)
    var startIndexOfLink = -1
    for (link in links) {
        val clickableSpan = object : ClickableSpan() {
            override fun updateDrawState(textPaint: TextPaint) {
                // use this to change the link color
                textPaint.color = textPaint.linkColor
                // toggle below value to enable/disable
                // the underline shown below the clickable text
                textPaint.isUnderlineText = true
            }

            override fun onClick(view: View) {
                Selection.setSelection((view as AppCompatTextView).text as Spannable, 0)
                view.invalidate()
                link.second.onClick(view)
            }
        }
        startIndexOfLink = this.text.toString().indexOf(link.first, startIndexOfLink + 1)
//      if(startIndexOfLink == -1) continue // todo if you want to verify your texts contains links text
        spannableString.setSpan(
            clickableSpan, startIndexOfLink, startIndexOfLink + link.first.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
    this.movementMethod = LinkMovementMethod.getInstance() // without LinkMovementMethod, link can not click
    this.setText(spannableString, TextView.BufferType.SPANNABLE)
}