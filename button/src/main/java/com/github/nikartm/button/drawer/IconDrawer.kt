package com.github.nikartm.button.drawer

import android.text.TextUtils
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.model.IconPosition

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class IconDrawer(val view: FitButton, val button: FButton)
    : Drawer<FitButton, FButton>(view, button) {

    private lateinit var iv: ImageView
    private lateinit var fl: FrameLayout

    override fun draw() {
        prepareIconLayout()
        fl.addView(getIcon())
        view.addView(fl)
    }

    private fun prepareIconLayout() {
        view.gravity = Gravity.CENTER
        fl = FrameLayout(view.context)
        fl.layoutParams = when (button.iconPosition) {
            IconPosition.LEFT, IconPosition.RIGHT -> drawIconLeftRight()
            IconPosition.TOP, IconPosition.BOTTOM -> drawIconTopBottom()
            else -> drawIconCenter()
        }
    }

    // Prepare icon to the drawing
    private fun getIcon() : ImageView {
        iv = ImageView(view.context)
        iv.setImageDrawable(button.icon)
        iv.setColorFilter(button.iconColor)
        val iconParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT)
        iconParams.gravity = button.iconGravity
        iconParams.width = button.iconWidth.toInt()
        iconParams.height = button.iconHeight.toInt()
        iv.layoutParams = iconParams
        return iv
    }

    private fun drawIconLeftRight() : FrameLayout.LayoutParams {
        view.orientation = LinearLayout.HORIZONTAL
        return FrameLayout.LayoutParams(WRAP_CONTENT, MATCH_PARENT)
    }

    private fun drawIconTopBottom() : FrameLayout.LayoutParams {
        view.orientation = LinearLayout.VERTICAL
        return FrameLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
    }

    private fun drawIconCenter() : FrameLayout.LayoutParams {
        view.orientation = LinearLayout.VERTICAL
        val params = if (TextUtils.isEmpty(button.text)) {
            FrameLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        } else{
            FrameLayout.LayoutParams(WRAP_CONTENT, MATCH_PARENT)
        }
        params.gravity = button.iconGravity
        return params
    }

}
