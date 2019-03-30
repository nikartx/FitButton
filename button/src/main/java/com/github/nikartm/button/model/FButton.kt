package com.github.nikartm.button.model

import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.view.View

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
data class FButton(
        var icon: Drawable? = null,
        var iconColor: Int = 0,
        var iconBackColor: Int = 0,
        var iconWidth: Float = 0f,
        var iconHeight: Float = 0f,
        var iconPadding: Float = 0f,
        var iconPaddingTop: Float = 0f,
        var iconPaddingBottom: Float = 0f,
        var iconPaddingStart: Float = 0f,
        var iconPaddingEnd: Float = 0f,
        var iconGravity: Int = Gravity.CENTER,
        var iconPosition: IconPosition = IconPosition.CENTER,
        var iconVisibility: Int = View.VISIBLE,

        var divColor: Int = 0,
        var divWidth: Float = 0f,
        var divHeight: Float = 0f,
        var divMarginTop: Float = 0f,
        var divMarginBottom: Float = 0f,
        var divVisibility: Int = View.GONE,

        var text: String? = null,
        var textFont: Typeface? = null,
        var textStyle: Int = 0,
        var textSize: Float = 0f,
        var textColor: Int = 0,
        var textAllCaps: Boolean = false,
        var textVisibility: Int = View.VISIBLE,

        var btnColor: Int = 0,
        var cornerRadius: Float = 0f,
        var showRipple: Boolean = false,
        var btnShape: Shape = Shape.RECTANGLE,

        var borderColor: Int = 0,
        var borderWidth: Float = 0f
)
