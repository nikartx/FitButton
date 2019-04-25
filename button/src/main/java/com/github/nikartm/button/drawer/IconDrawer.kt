package com.github.nikartm.button.drawer

import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class IconDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    private var iv: ImageView = ImageView(view.context)

    override fun draw() {
        initIcon()
        view.addView(iv)
    }

    override fun isReady(): Boolean {
        return button.icon != null && button.iconVisibility != View.GONE
    }

    // Prepare icon to the drawing
    private fun initIcon() : ImageView {
        iv.setImageDrawable(button.icon)
        iv.visibility = button.iconVisibility
        setColor()

        val iconParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        iconParams.width = button.iconWidth.toInt()
        iconParams.height = button.iconHeight.toInt()
        iconParams.marginStart = button.iconMarginStart.toInt()
        iconParams.topMargin = button.iconMarginTop.toInt()
        iconParams.marginEnd = button.iconMarginEnd.toInt()
        iconParams.bottomMargin = button.iconMarginBottom.toInt()
        iv.layoutParams = iconParams
        return iv
    }

    private fun setColor() {
        if (!button.enable) {
            if (button.elementsDisableColor != 0) {
                iv.setColorFilter(button.elementsDisableColor)
            } else {
                iv.setColorFilter(button.iconColor)
                iv.alpha = getAlpha()
            }
        } else {
            iv.setColorFilter(button.iconColor)
        }
    }

    override fun updateLayout() {
        initIcon()
    }

}
