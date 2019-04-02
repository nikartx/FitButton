package com.github.nikartm.button.drawer

import android.graphics.drawable.GradientDrawable
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.model.Shape
import com.github.nikartm.button.pxToDp

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class ContainerDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    override fun draw() {
        drawLayout()
    }

    override fun isReady(): Boolean {
        return true
    }

    private fun drawLayout() {
        val container = GradientDrawable()
        container.cornerRadius = pxToDp(button.cornerRadius)
        container.setColor(button.btnColor)
        container.setStroke(button.borderWidth.toInt(), button.borderColor)
        view.background = container
        view.gravity = button.gravity
        drawShape(container)
    }

    private fun drawShape(container: GradientDrawable) {
        container.shape = when (button.btnShape) {
            Shape.RECTANGLE -> GradientDrawable.RECTANGLE
            Shape.OVAL -> GradientDrawable.OVAL
            Shape.SQUARE -> alignSides(GradientDrawable.RECTANGLE)
            Shape.CIRCLE -> alignSides(GradientDrawable.OVAL)
        }
    }

    private fun alignSides(shape: Int) : Int {
        val min = Math.min(view.measuredWidth, view.measuredHeight)
        view.layoutParams.width = min
        view.layoutParams.height = min
        return shape
    }

}