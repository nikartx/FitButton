package com.github.nikartm.button

import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.model.Shape

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
class AttributeController(private val view: View, private val attrs: AttributeSet) {

    /**
     * @return initialized [FButton]
     */
    lateinit var button: FButton

    init {
        initAttr()
    }

    private fun initAttr() {
        val typedArray = view.context.obtainStyledAttributes(attrs, R.styleable.FitButton)
        // Init button image
        val image = typedArray.getDrawable(R.styleable.FitButton_fb_image)
        val imgColor = typedArray.getColor(R.styleable.FitButton_fb_imageColor, Color.TRANSPARENT)
        val imgBackColor = typedArray.getColor(R.styleable.FitButton_fb_imageBackGroundColor, 0)
        val imgWidth = typedArray.getDimension(
                R.styleable.FitButton_fb_imageWidth, image?.intrinsicWidth?.toFloat() ?: 0f
        )
        val imgHeight = typedArray.getDimension(
                R.styleable.FitButton_fb_imageHeight, image?.intrinsicHeight?.toFloat() ?: 0f
        )
        val imgPadding = typedArray.getDimension(R.styleable.FitButton_fb_imagePadding, 0f)
        val imgPaddingTop = typedArray.getDimension(R.styleable.FitButton_fb_imagePaddingTop, 0f)
        val imgPaddingBottom = typedArray.getDimension(R.styleable.FitButton_fb_imagePaddingBottom, 0f)
        val imgPaddingStart = typedArray.getDimension(R.styleable.FitButton_fb_imagePaddingStart, 0f)
        val imgPaddingEnd = typedArray.getDimension(R.styleable.FitButton_fb_imagePaddingEnd, 0f)
        val imgGravity = typedArray.getInt(R.styleable.FitButton_fb_imageGravity, Gravity.CENTER)
        val imgVisibility = typedArray.getInt(R.styleable.FitButton_fb_imageVisibility, View.VISIBLE)

        // Init divider
        val divColor = typedArray.getColor(R.styleable.FitButton_fb_divColor, Color.DKGRAY)
        val divWidth = typedArray.getDimension(R.styleable.FitButton_fb_divWidth, 0f)
        val divHeight = typedArray.getDimension(R.styleable.FitButton_fb_divHeight, 0f)
        val divMarginTop = typedArray.getDimension(R.styleable.FitButton_fb_divMarginTop, 0f)
        val divMarginBottom = typedArray.getDimension(R.styleable.FitButton_fb_divMarginBottom, 0f)
        val divVisibility = typedArray.getInt(R.styleable.FitButton_fb_divVisibility, View.VISIBLE)

        // Init button text
        val text = typedArray.getString(R.styleable.FitButton_fb_text)
        val fontPath = typedArray.getString(R.styleable.FitButton_fb_fontFamily)
        val textFont = if (fontPath != null) Typeface.createFromFile(fontPath) else Typeface.DEFAULT
        val textStyle = typedArray.getInt(R.styleable.FitButton_fb_textStyle, Typeface.NORMAL)
        val textSize = typedArray.getDimension(R.styleable.FitButton_fb_textSize, txtPxToSp(16f))
        val textColor = typedArray.getColor(R.styleable.FitButton_fb_textColor, Color.DKGRAY)
        val textAllCaps = typedArray.getBoolean(R.styleable.FitButton_fb_textAllCaps, false)
        val textVisibility = typedArray.getInt(R.styleable.FitButton_fb_textVisibility, View.VISIBLE)

        // Init button
        val btnColor = typedArray.getColor(R.styleable.FitButton_fb_backgroundColor, 0)
        val cornerRadius = typedArray.getDimension(R.styleable.FitButton_fb_cornerRadius, 0f)
        val showRipple = typedArray.getBoolean(R.styleable.FitButton_fb_showRipple, true)
        val shape = typedArray.getInt(R.styleable.FitButton_fb_shape, 0)

        // Init border
        val borderColor = typedArray.getColor(R.styleable.FitButton_fb_borderColor, Color.TRANSPARENT)
        val borderWidth = typedArray.getDimension(R.styleable.FitButton_fb_borderWidth, 0f)

        button = FButton(image,
                imgColor,
                imgBackColor,
                imgWidth,
                imgHeight,
                imgPadding,
                imgPaddingTop,
                imgPaddingBottom,
                imgPaddingStart,
                imgPaddingEnd,
                imgGravity,
                imgVisibility,
                divColor,
                divWidth,
                divHeight,
                divMarginTop,
                divMarginBottom,
                divVisibility,
                text,
                textFont,
                textStyle,
                textSize,
                textColor,
                textAllCaps,
                textVisibility,
                btnColor,
                cornerRadius,
                showRipple,
                Shape.values()[shape],
                borderColor,
                borderWidth)

        typedArray.recycle()
    }

}
