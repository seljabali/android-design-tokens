package com.seljabali.designtokens.utilities

import android.content.Context
import android.graphics.Paint
import android.os.Build
import android.widget.TextView
import androidx.annotation.StyleRes

fun TextView.setUnderlined() {
    paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG
}

fun TextView.getSp(): Int = (textSize / resources.displayMetrics.scaledDensity).toInt()

fun TextView.setTextAppearanceStyle(context: Context, @StyleRes resId: Int) {
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
        setTextAppearance(context, resId)
    } else {
        setTextAppearance(resId)
    }
}