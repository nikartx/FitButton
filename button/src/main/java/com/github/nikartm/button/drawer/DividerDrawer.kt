package com.github.nikartm.button.drawer

import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.model.Shape

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class DividerDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    private lateinit var div: View
    private lateinit var divParams: ViewGroup.MarginLayoutParams

    override fun draw() {
        initDivider()
        view.addView(div)
    }

    override fun isReady(): Boolean {
        return button.divVisibility != View.GONE
    }

    private fun initDivider() {
        div = View(view.context)
        div.setBackgroundColor(button.divColor)
        div.visibility = button.divVisibility
        divParams = ViewGroup.MarginLayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        divParams.marginStart = button.divMarginStart.toInt()
        divParams.topMargin = button.divMarginTop.toInt()
        divParams.marginEnd = button.divMarginEnd.toInt()
        divParams.bottomMargin = button.divMarginBottom.toInt()
        setMeasure()
        div.layoutParams = divParams
    }

    // Set the divider measure if a shape of the button was changed
    private fun setMeasure() {
        val minMeasure = Math.min(view.measuredWidthAndState, view.measuredHeightAndState)
        val borderMeasure = (button.borderWidth * 2f).toInt()
        if (button.divHeight == 0f && view.orientation == LinearLayout.HORIZONTAL) {
            val wMeas = when(button.btnShape) {
                Shape.SQUARE, Shape.CIRCLE -> minMeasure
                else -> view.measuredHeightAndState
            }
            divParams.height = (wMeas - borderMeasure)
        } else {
            divParams.height = button.divHeight.toInt()
        }
        if (button.divWidth == 0f && view.orientation == LinearLayout.VERTICAL) {
            val hMeas = when(button.btnShape) {
                Shape.SQUARE, Shape.CIRCLE -> minMeasure
                else -> view.measuredWidthAndState
            }
            divParams.width = (hMeas - borderMeasure)
        } else {
            divParams.width = button.divWidth.toInt()
        }
    }

}
