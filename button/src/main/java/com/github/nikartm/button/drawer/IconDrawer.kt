package com.github.nikartm.button.drawer

import android.text.TextUtils
import android.view.Gravity
import android.view.View
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

    override fun isReady(): Boolean {
        return button.icon != null && (button.iconVisibility == View.VISIBLE
                || button.iconVisibility == View.INVISIBLE)
    }

    private fun prepareIconLayout() {
        fl = FrameLayout(view.context)
        fl.layoutParams = when (button.iconPosition) {
            IconPosition.LEFT, IconPosition.RIGHT -> drawIconLeftRight()
            IconPosition.TOP, IconPosition.BOTTOM -> drawIconTopBottom()
            else -> drawIconCenter()
        }
        fl.setBackgroundColor(button.iconBackColor)
    }

    // Prepare icon to the drawing
    private fun getIcon() : ImageView {
        iv = ImageView(view.context)
        iv.setImageDrawable(button.icon)
        iv.setColorFilter(button.iconColor)
        iv.visibility = button.iconVisibility
        val iconParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                button.gravity)
        iconParams.width = button.iconWidth.toInt()
        iconParams.height = button.iconHeight.toInt()
        iconParams.marginStart = button.iconMarginStart.toInt()
        iconParams.topMargin = button.iconMarginTop.toInt()
        iconParams.marginEnd = button.iconMarginEnd.toInt()
        iconParams.bottomMargin = button.iconMarginBottom.toInt()
        iv.layoutParams = iconParams
        return iv
    }

    private fun drawIconLeftRight() : FrameLayout.LayoutParams {
        view.orientation = LinearLayout.HORIZONTAL
        return FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
    }

    private fun drawIconTopBottom() : FrameLayout.LayoutParams {
        view.orientation = LinearLayout.VERTICAL
        return FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
    }

    private fun drawIconCenter() : FrameLayout.LayoutParams {
        view.orientation = LinearLayout.VERTICAL
        val params = if (TextUtils.isEmpty(button.text)) {
            FrameLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        } else{
            FrameLayout.LayoutParams(WRAP_CONTENT, MATCH_PARENT)
        }
        params.gravity = button.gravity
        return params
    }

}
