package com.github.nikartm.button

import android.content.Context
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.widget.LinearLayout
import com.github.nikartm.button.model.IconPosition

/**
 * The button which can use with icon, text, divider and custom ripple effect.
 *
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
class FitButton : LinearLayout {

    private lateinit var manager: DrawManager

    constructor(context: Context) : super(context) {
        bind(null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        bind(attrs)
    }

    private fun bind(attrs: AttributeSet?) {
        manager = DrawManager(this, attrs)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        manager.drawButton()
    }

    /**
     * Get the button icon
     * @return icon [Drawable]
     */
    fun getIcon() : Drawable? = manager.getButton().icon

    /**
     * Set an icon for the button
     * @param drawable [Drawable]
     */
    fun setIcon(drawable: Drawable) : FitButton {
        manager.getButton().icon = drawable
        updateView()
        return this
    }

    /**
     * Get the button icon color
     * @return icon color [Int]
     */
    fun getIconColor() : Int = manager.getButton().iconColor

    /**
     * Set the button icon color
     * @param iconColor [Int]
     */
    fun setIconColor(iconColor: Int) : FitButton {
        manager.getButton().iconColor = iconColor
        updateView()
        return this
    }

    /**
     * Get the button icon width
     * @return icon width [Float]
     */
    fun getIconWidth() : Float = manager.getButton().iconWidth

    /**
     * Set the button icon width
     * @param iconWidth [Float]
     */
    fun setIconWidth(iconWidth: Float) : FitButton {
        manager.getButton().iconWidth = iconWidth
        updateView()
        return this
    }

    /**
     * Get the button icon height
     * @return icon height [Float]
     */
    fun getIconHeight() : Float = manager.getButton().iconHeight

    /**
     * Set the button icon height
     * @param iconHeight [Float]
     */
    fun setIconHeight(iconHeight: Float) : FitButton {
        manager.getButton().iconHeight = iconHeight
        updateView()
        return this
    }

    /**
     * Get an icon start margin
     * @return icon start margin [Float]
     */
    fun getIconMarginStart() : Float = manager.getButton().iconMarginStart

    /**
     * Set an icon start margin
     * @param iconMarginStart [Float]
     */
    fun setIconMarginStart(iconMarginStart: Float) : FitButton {
        manager.getButton().iconMarginStart = iconMarginStart
        updateView()
        return this
    }

    /**
     * Get an icon top margin
     * @return icon top margin [Float]
     */
    fun getIconMarginTop() : Float = manager.getButton().iconMarginTop

    /**
     * Set an icon top margin
     * @param iconMarginTop [Float]
     */
    fun setIconMarginTop(iconMarginTop: Float) : FitButton {
        manager.getButton().iconMarginTop = iconMarginTop
        updateView()
        return this
    }

    /**
     * Get an icon end margin
     * @return icon end margin [Float]
     */
    fun getIconMarginEnd() : Float = manager.getButton().iconMarginEnd

    /**
     * Set an icon end margin
     * @param iconMarginEnd [Float]
     */
    fun setIconMarginEnd(iconMarginEnd: Float) : FitButton {
        manager.getButton().iconMarginEnd = iconMarginEnd
        updateView()
        return this
    }

    /**
     * Get an icon bottom margin
     * @return icon bottom margin [Float]
     */
    fun getIconMarginBottom() : Float = manager.getButton().iconMarginBottom

    /**
     * Set an icon bottom margin
     * @param iconMarginBottom [Float]
     */
    fun setIconMarginBottom(iconMarginBottom: Float) : FitButton {
        manager.getButton().iconMarginBottom = iconMarginBottom
        updateView()
        return this
    }

    /**
     * Get an icon position relative to other elements on the button
     * @return icon position [IconPosition]
     */
    fun getIconPosition() : IconPosition = manager.getButton().iconPosition

    /**
     * Set an icon position relative to other elements on the button
     * @param iconPosition [IconPosition]
     */
    fun setIconPosition(iconPosition: IconPosition) : FitButton {
        manager.getButton().iconPosition = iconPosition
        updateView()
        return this
    }

    /**
     * Get an icon visibility. Uses the [View] constants VISIBLE, INVISIBLE, GONE
     * @return icon visibility [Int]
     */
    fun getIconVisibility() : Int = manager.getButton().iconVisibility

    /**
     * Set an icon visibility.
     * Uses the [View] constants VISIBLE, INVISIBLE, GONE
     * If you want set GONE for icon and divider was VISIBLE,
     * it's will be set GONE too.
     * But if you want to show divider without an icon,
     * please use INVISIBLE for this case
     * @param iconVisibility [IconPosition]
     */
    fun setIconVisibility(iconVisibility: Int) : FitButton {
        manager.getButton().iconVisibility = iconVisibility
        updateView()
        return this
    }

    /**
     * Get the divider color
     * @return divider color [Int]
     */
    fun getDividerColor() : Int = manager.getButton().divColor

    /**
     * Set the divider color
     * @param divColor [Int]
     */
    fun setDividerColor(divColor: Int) : FitButton {
        manager.getButton().divColor = divColor
        updateView()
        return this
    }

    /**
     * Get the divider width
     * @return divider width [Float]
     */
    fun getDividerWidth() : Float = manager.getButton().divWidth

    /**
     * Set the divider width
     * @param divWidth [Float]
     */
    fun setDividerWidth(divWidth: Float) : FitButton {
        manager.getButton().divWidth = divWidth
        updateView()
        return this
    }

    /**
     * Get the divider height
     * @return divider height [Float]
     */
    fun getDividerHeight() : Float = manager.getButton().divHeight

    /**
     * Set the divider height
     * @param divHeight [Float]
     */
    fun setDividerHeight(divHeight: Float) : FitButton {
        manager.getButton().divHeight = divHeight
        updateView()
        return this
    }

    /**
     * Get the divider top margin
     * @return divider top margin [Float]
     */
    fun getDividerMarginTop() : Float = manager.getButton().divMarginTop

    /**
     * Set the divider top margin
     * @param divMarginTop [Float]
     */
    fun setDividerMarginTop(divMarginTop: Float) : FitButton {
        manager.getButton().divMarginTop = divMarginTop
        updateView()
        return this
    }

    /**
     * Get the divider bottom margin
     * @return divider bottom margin [Float]
     */
    fun getDividerMarginBottom() : Float = manager.getButton().divMarginBottom

    /**
     * Set the divider bottom margin
     * @param divMarginBottom [Float]
     */
    fun setDividerMarginBottom(divMarginBottom: Float) : FitButton {
        manager.getButton().divMarginBottom = divMarginBottom
        updateView()
        return this
    }

    /**
     * Get the divider start margin
     * @return divider start margin [Float]
     */
    fun getDividerMarginStart() : Float = manager.getButton().divMarginStart

    /**
     * Set the divider start margin
     * @param divMarginStart [Float]
     */
    fun setDividerMarginStart(divMarginStart: Float) : FitButton {
        manager.getButton().divMarginStart = divMarginStart
        updateView()
        return this
    }

    /**
     * Get the divider end margin
     * @return divider end margin [Float]
     */
    fun getDividerMarginEnd() : Float = manager.getButton().divMarginEnd

    /**
     * Set the divider end margin
     * @param divMarginEnd [Float]
     */
    fun setDividerMarginEnd(divMarginEnd: Float) : FitButton {
        manager.getButton().divMarginEnd = divMarginEnd
        updateView()
        return this
    }

    /**
     * Get the divider visibility.
     * Uses the [View] constants VISIBLE, INVISIBLE, GONE
     * @return divider visibility [Int]
     */
    fun getDividerVisibility() : Int = manager.getButton().divVisibility

    /**
     * Set the divider visibility
     * If you want set GONE for icon and divider was VISIBLE,
     * it's will be set GONE too.
     * But if you want to show divider without an icon,
     * please use an icon INVISIBLE for this case
     * @param divVisibility [Int]
     */
    fun setDividerVisibility(divVisibility: Int) : FitButton {
        manager.getButton().divVisibility = divVisibility
        updateView()
        return this
    }

    /**
     * Get the button text
     * @return text [String]
     */
    fun getText() : String? = manager.getButton().text

    /**
     * Set the button text
     * @param text [String]
     */
    fun setText(text: String?) : FitButton {
        manager.getButton().text = text
        updateView()
        return this
    }

    /**
     * Get the button text start padding
     * @return text start padding [Float]
     */
    fun getTextPaddingStart() : Float = manager.getButton().textPaddingStart

    /**
     * Set the button text start padding
     * @param textPaddingStart [Float]
     */
    fun setTextPaddingStart(textPaddingStart: Float) : FitButton {
        manager.getButton().textPaddingStart = textPaddingStart
        updateView()
        return this
    }

    /**
     * Get the button text top padding
     * @return text top padding [Float]
     */
    fun getTextPaddingTop() : Float = manager.getButton().textPaddingTop

    /**
     * Set the button text top padding
     * @param textPaddingTop [Float]
     */
    fun setTextPaddingTop(textPaddingTop: Float) : FitButton {
        manager.getButton().textPaddingTop = textPaddingTop
        updateView()
        return this
    }

    /**
     * Get the button text end padding
     * @return text end padding [Float]
     */
    fun getTextPaddingEnd() : Float = manager.getButton().textPaddingEnd

    /**
     * Set the button text top padding
     * @param textPaddingEnd [Float]
     */
    fun setTextPaddingEnd(textPaddingEnd: Float) : FitButton {
        manager.getButton().textPaddingEnd = textPaddingEnd
        updateView()
        return this
    }

    /**
     * Get the button text bottom padding
     * @return text bottom padding [Float]
     */
    fun getTextPaddingBottom() : Float = manager.getButton().textPaddingBottom

    /**
     * Set the button text bottom padding
     * @param textPaddingBottom [Float]
     */
    fun setTextPaddingBottom(textPaddingBottom: Float) : FitButton {
        manager.getButton().textPaddingBottom = textPaddingBottom
        updateView()
        return this
    }

    /**
     * Get the button text font
     * @return text font [Typeface]
     */
    fun getTextTypeface() : Typeface = manager.getButton().textFont

    /**
     * Set the button text font
     * @param textFont [Typeface]
     */
    fun setTextTypeface(textFont: Typeface) : FitButton {
        manager.getButton().textFont = textFont
        updateView()
        return this
    }

    /**
     * Get the button text style. By default uses [Typeface.NORMAL]
     * @return text style [Int]
     */
    fun getTextStyle() : Int = manager.getButton().textStyle

    /**
     * Set the button text style. Use values from [Typeface]
     * @param textStyle [Int]
     */
    fun setTextStyle(textStyle: Int) : FitButton {
        manager.getButton().textStyle = textStyle
        updateView()
        return this
    }

    /**
     * Get the button text size
     * @return text size [Float]
     */
    fun getTextSize() : Float = manager.getButton().textSize

    /**
     * Set the button text size
     * @param textSize [Float]
     */
    fun setTextSize(textSize: Float) : FitButton {
        manager.getButton().textSize = textSize
        updateView()
        return this
    }

    /**
     * Get the button text color
     * @return text color [Int]
     */
    fun getTextColor() : Int = manager.getButton().textColor

    /**
     * Set the button text color
     * @param textColor [Int]
     */
    fun setTextColor(textColor: Int) : FitButton {
        manager.getButton().textColor = textColor
        updateView()
        return this
    }

    /**
     * Get the text all caps state
     * @return text all caps [Boolean]
     */
    fun isTextAllCaps() : Boolean = manager.getButton().textAllCaps

    /**
     * Set the button text all caps
     * @param textAllCaps [Boolean]
     */
    fun setTextColor(textAllCaps: Boolean) : FitButton {
        manager.getButton().textAllCaps = textAllCaps
        updateView()
        return this
    }

    /**
     * Get a text visibility.
     * Uses the [View] constants VISIBLE, INVISIBLE, GONE
     * @return text visibility [Int]
     */
    fun getTextVisibility() : Int = manager.getButton().textVisibility

    /**
     * Set a text visibility.
     * Uses the [View] constants VISIBLE, INVISIBLE, GONE
     * @param textVisibility [Int]
     */
    fun setTextVisibility(textVisibility: Int) : FitButton {
        manager.getButton().textVisibility = textVisibility
        updateView()
        return this
    }

    /**
     * Get the button text gravity
     * Currently available for use values:
     * [Gravity] top, bottom, center, start, end
     * By default using [Gravity.CENTER]
     * @return text gravity [Int]
     */
    fun getTextGravity() : Int = manager.getButton().textGravity

    /**
     * Set the button text gravity
     * Currently available for use values:
     * [Gravity] top, bottom, center, start, end
     * @param textGravity [Int]
     */
    fun setTextGravity(textGravity: Int) : FitButton {
        manager.getButton().textGravity = textGravity
        updateView()
        return this
    }

    private fun updateView() {
        invalidate()
    }

}
