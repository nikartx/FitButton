package com.github.nikartm.button.drawer

import android.graphics.Typeface
import android.widget.TextView
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.getDensity
import com.github.nikartm.button.model.FButton

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class TextDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    private lateinit var tv: TextView

    override fun draw() {
        tv = TextView(view.context)
        tv.text = button.text
        tv.typeface = Typeface.create(button.textFont, button.textStyle)
        tv.textSize = button.textSize / getDensity()
        tv.setTextColor(button.textColor)
        tv.isAllCaps = button.textAllCaps
        tv.visibility = button.textVisibility
        view.addView(tv)
    }

}