package com.github.nikartm.button.drawer

import android.graphics.Typeface
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
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
        if (view.orientation == LinearLayout.HORIZONTAL) {
            tv.layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, MATCH_PARENT, 1f)
        } else {
            tv.layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT, 1f)
        }
        tv.text = button.text
        tv.textSize = button.textSize / getDensity()
        tv.setTextColor(button.textColor)
        tv.isAllCaps = button.textAllCaps
        tv.visibility = button.textVisibility
        tv.gravity = button.textGravity
        tv.setPadding(button.textPaddingStart.toInt(), button.textPaddingTop.toInt(),
                button.textPaddingEnd.toInt(), button.textPaddingBottom.toInt())
        setTypeface()
    }

    private fun setTypeface() {
        tv.setTypeface(Typeface.DEFAULT, button.textStyle)
        if (button.textFont != null) {
            tv.setTypeface(button.textFont, button.textStyle)
        } else {
            if (button.fontRes != 0) {
                try {
                    val tf = ResourcesCompat.getFont(view.context, button.fontRes)
                    tv.setTypeface(tf, button.textStyle)
                    button.textFont = tf
                } catch (e: Exception) {
                    Log.e(TextDrawer::class.java.simpleName, "Incorrect font resource")
                }
            }
        }
    }

}
