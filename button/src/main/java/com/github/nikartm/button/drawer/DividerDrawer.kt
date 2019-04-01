package com.github.nikartm.button.drawer

import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
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
        return button.divWidth != 0f
                && button.divHeight != 0f
                && button.divVisibility != View.GONE
    }

    private fun initDivider() {
        div = View(view.context)
        div.setBackgroundColor(button.divColor)
        divParams = ViewGroup.MarginLayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        divParams.width = button.divWidth.toInt()
        divParams.height = button.divHeight.toInt()
        divParams.marginStart = button.divMarginStart.toInt()
        divParams.topMargin = button.divMarginTop.toInt()
        divParams.marginEnd = button.divMarginEnd.toInt()
        divParams.bottomMargin = button.divMarginBottom.toInt()
        div.layoutParams = divParams
        div.visibility = button.divVisibility
    }

}
