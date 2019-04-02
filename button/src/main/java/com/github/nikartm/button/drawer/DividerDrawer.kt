package com.github.nikartm.button.drawer

import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton

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
        if (button.divHeight == 0f && view.orientation == LinearLayout.HORIZONTAL) {
            divParams.height = (view.measuredHeight - (button.borderWidth * 2f).toInt())
        } else {
            divParams.height = button.divHeight.toInt()
        }
        if (button.divWidth == 0f && view.orientation == LinearLayout.VERTICAL) {
            divParams.width = (view.measuredWidth - (button.borderWidth * 2f).toInt())
        } else {
            divParams.width = button.divWidth.toInt()
        }
        divParams.marginStart = button.divMarginStart.toInt()
        divParams.topMargin = button.divMarginTop.toInt()
        divParams.marginEnd = button.divMarginEnd.toInt()
        divParams.bottomMargin = button.divMarginBottom.toInt()
        div.layoutParams = divParams
    }

}
