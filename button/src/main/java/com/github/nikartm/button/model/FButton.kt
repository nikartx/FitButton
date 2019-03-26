package com.github.nikartm.button.model

import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.View

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
data class FButton(
        var image: Drawable? = null,
        var imgColor: Int = 0,
        var imgBackColor: Int = 0,
        var imgWidth: Float = 0f,
        var imgHeight: Float = 0f,
        var imgPadding: Float = 0f,
        var imgPaddingTop: Float = 0f,
        var imgPaddingBottom: Float = 0f,
        var imgPaddingStart: Float = 0f,
        var imgPaddingEnd: Float = 0f,
        var imgGravity: Int = 0x11, // Center
        var imgVisibility: Int = View.VISIBLE,

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
