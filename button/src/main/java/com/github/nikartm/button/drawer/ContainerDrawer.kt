package com.github.nikartm.button.drawer

import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.View
import com.github.nikartm.button.model.FButton
import com.github.nikartm.button.pxToDp

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal class ContainerDrawer(val view: View, val button: FButton) : Drawer<FButton>(view, button) {

    override fun draw() {
        drawLayout()
    }

    private fun drawLayout() {
        val shape = GradientDrawable()
        shape.cornerRadius = pxToDp(button.cornerRadius)
        shape.setColor(button.btnColor)
        view.background = shape
    }

}