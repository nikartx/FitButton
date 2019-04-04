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
        var iconWidth: Float = 0f,
        var iconHeight: Float = 0f,
        var iconMarginStart: Float = 0f,
        var iconMarginTop: Float = 0f,
        var iconMarginEnd: Float = 0f,
        var iconMarginBottom: Float = 0f,
        var iconPosition: IconPosition = IconPosition.CENTER,
        var iconVisibility: Int = View.VISIBLE,

        var divColor: Int = 0,
        var divWidth: Float = 0f,
        var divHeight: Float = 0f,
        var divMarginTop: Float = 0f,
        var divMarginBottom: Float = 0f,
        var divMarginStart: Float = 0f,
        var divMarginEnd: Float = 0f,
        var divVisibility: Int = View.VISIBLE,

        var text: String? = null,
        var textPaddingStart: Float = 0f,
        var textPaddingTop: Float = 0f,
        var textPaddingEnd: Float = 0f,
        var textPaddingBottom: Float = 0f,
        var textFont: Typeface = Typeface.DEFAULT,
        var textStyle: Int = Typeface.NORMAL,
        var textSize: Float = 16f,
        var textColor: Int = 0,
        var textAllCaps: Boolean = false,
        var textVisibility: Int = View.VISIBLE,
        var textGravity: Int = Gravity.CENTER,

        var btnColor: Int = 0,
        var cornerRadius: Float = 0f,
        var enableRipple: Boolean = true,
        var rippleColor: Int = 0,
        var btnShape: Shape = Shape.RECTANGLE,
        var gravity: Int = Gravity.CENTER,
        var borderColor: Int = 0,
        var borderWidth: Float = 0f
)
