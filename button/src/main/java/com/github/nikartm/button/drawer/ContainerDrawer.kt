package com.github.nikartm.button.drawer

import android.graphics.drawable.GradientDrawable
import android.view.View
import android.widget.LinearLayout
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.model.IconPosition
import com.github.nikartm.button.model.Shape
import com.github.nikartm.button.util.pxToDp
import com.github.nikartm.button.util.RippleEffect

/**
 * Drawing the FitButton view container
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class ContainerDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    private lateinit var container: GradientDrawable

    override fun draw() {
        initContainer()
        setOrientation()
        drawShape()
    }

    override fun isReady(): Boolean {
        return view.visibility != View.GONE
    }

    private fun initContainer() {
        container = GradientDrawable()
        container.cornerRadius = pxToDp(button.cornerRadius)
        container.setColor(button.btnColor)
        container.setStroke(button.borderWidth.toInt(), button.borderColor)
        view.gravity = button.gravity
        addRipple()
    }

    // Add a ripple effect for the button if it was enabled
    private fun addRipple() {
        view.isEnabled = button.enable
        view.isClickable = button.enable
        view.isFocusable = button.enable
        RippleEffect.createRipple(view,
                button.enableRipple && button.enable,
                button.btnColor,
                button.rippleColor,
                button.cornerRadius,
                button.btnShape,
                container)
    }

    // Set the layout orientation dependent on icon position
    private fun setOrientation() {
        view.orientation = when (button.iconPosition) {
            IconPosition.LEFT, IconPosition.RIGHT -> LinearLayout.HORIZONTAL
            else -> LinearLayout.VERTICAL
        }
    }

    // Draw button shape
    private fun drawShape() {
        container.shape = when (button.btnShape) {
            Shape.RECTANGLE -> GradientDrawable.RECTANGLE
            Shape.OVAL -> GradientDrawable.OVAL
            Shape.SQUARE -> alignSides(GradientDrawable.RECTANGLE)
            Shape.CIRCLE -> alignSides(GradientDrawable.OVAL)
        }
    }

    // Align a shape sides by a min side
    private fun alignSides(shape: Int) : Int {
        val min = Math.min(view.measuredWidth, view.measuredHeight)
        if (view.layoutParams != null) {
            view.layoutParams.width = min
            view.layoutParams.height = min
        }
        return shape
    }

}