package com.github.nikartm.button

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.LinearLayout
import com.github.nikartm.button.model.IconPosition

/**
 * The button which can use with icon, text, and divider
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
     * Set an icon visibility. Uses the [View] constants VISIBLE, INVISIBLE, GONE
     * If you want set GONE for icon and divider was VISIBLE, it's will be set GONE too.
     * But if you want to show divider without an icon, please use INVISIBLE for this case
     * @param iconVisibility [IconPosition]
     */
    fun setIconVisibility(iconVisibility: Int) : FitButton {
        manager.getButton().iconVisibility = iconVisibility
        updateView()
        return this
    }

    private fun updateView() {
        invalidate()
    }

}
