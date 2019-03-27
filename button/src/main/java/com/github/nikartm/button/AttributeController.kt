package com.github.nikartm.button

import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.model.IconPosition
import com.github.nikartm.button.model.Shape

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
internal class AttributeController(private val view: View, private val attrs: AttributeSet) {

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
        val icon = typedArray.getDrawable(R.styleable.FitButton_fb_icon)
        val iconColor = typedArray.getColor(R.styleable.FitButton_fb_iconColor, Color.TRANSPARENT)
        val iconBackColor = typedArray.getColor(R.styleable.FitButton_fb_iconBackGroundColor, 0)
        val iconWidth = typedArray.getDimension(
                R.styleable.FitButton_fb_iconWidth, icon?.intrinsicWidth?.toFloat() ?: 0f
        )
        val iconHeight = typedArray.getDimension(
                R.styleable.FitButton_fb_iconHeight, icon?.intrinsicHeight?.toFloat() ?: 0f
        )
        val iconPadding = typedArray.getDimension(R.styleable.FitButton_fb_iconPadding, 0f)
        val iconPaddingTop = typedArray.getDimension(R.styleable.FitButton_fb_iconPaddingTop, 0f)
        val iconPaddingBottom = typedArray.getDimension(R.styleable.FitButton_fb_iconPaddingBottom, 0f)
        val iconPaddingStart = typedArray.getDimension(R.styleable.FitButton_fb_iconPaddingStart, 0f)
        val iconPaddingEnd = typedArray.getDimension(R.styleable.FitButton_fb_iconPaddingEnd, 0f)
        val iconGravity = typedArray.getInt(R.styleable.FitButton_fb_iconGravity, Gravity.CENTER)
        val iconPosition = typedArray.getInt(R.styleable.FitButton_fb_iconPosition, IconPosition.LEFT.position)
        val iconVisibility = typedArray.getInt(R.styleable.FitButton_fb_iconVisibility, View.VISIBLE)

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
        val shape = typedArray.getInt(R.styleable.FitButton_fb_shape, Shape.RECTANGLE.position)

        // Init border
        val borderColor = typedArray.getColor(R.styleable.FitButton_fb_borderColor, Color.TRANSPARENT)
        val borderWidth = typedArray.getDimension(R.styleable.FitButton_fb_borderWidth, 0f)

        button = FButton(icon,
                iconColor,
                iconBackColor,
                iconWidth,
                iconHeight,
                iconPadding,
                iconPaddingTop,
                iconPaddingBottom,
                iconPaddingStart,
                iconPaddingEnd,
                iconGravity,
                IconPosition.values().first { ic -> ic.position == iconPosition },
                iconVisibility,
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
                Shape.values().first { s -> s.position == shape },
                borderColor,
                borderWidth)

        typedArray.recycle()
    }

}
