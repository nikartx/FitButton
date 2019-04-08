package com.github.nikartm.button.drawer

import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import android.widget.TextView
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.util.getDensity

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class TextDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    private lateinit var tv: TextView

    override fun draw() {
        initText()
        view.addView(tv)
    }

    override fun isReady(): Boolean {
        return !TextUtils.isEmpty(button.text) && button.textVisibility != View.GONE
    }

    private fun initText() {
        tv = TextView(view.context)
        tv.text = button.text
        tv.textSize = button.textSize / getDensity()
        tv.setTextColor(button.textColor)
        tv.isAllCaps = button.textAllCaps
        tv.visibility = button.textVisibility
        tv.gravity = button.textGravity
        tv.setPadding(button.textPaddingStart.toInt(), button.textPaddingTop.toInt(),
                button.textPaddingEnd.toInt(), button.textPaddingBottom.toInt())
        if (view.orientation == LinearLayout.HORIZONTAL) {
            tv.layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, MATCH_PARENT, 1f)
        } else {
            tv.layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT, 1f)

        }
        setTypeface()
    }

    private fun setTypeface() {
        if (button.textFont != null) {
            tv.typeface = button.textFont
        } else{
            if (button.fontRes != 0) {
                try {
                    view.setTextFont(button.fontRes)
                    tv.setTypeface(button.textFont, Typeface.NORMAL)
                } catch (e: Exception) {
                    Log.e(TextDrawer::class.java.simpleName, "Incorrect font resource")
                }
            }
        }
    }

}
