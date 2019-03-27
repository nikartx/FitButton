package com.github.nikartm.button

import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import com.github.nikartm.button.model.FButton

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
internal class DrawManager constructor(private val view: View, private val attrs : AttributeSet) {

    private val controller = AttributeController(view, attrs)
    private val drawer = ButtonDrawer(view, controller.button)

    companion object Create {
        fun init(view: View, attrs : AttributeSet): DrawManager {
            return DrawManager(view, attrs)
        }
    }

    fun drawButton(canvas: Canvas) {
        drawer.draw(canvas)
    }

    fun getButton() : FButton {
        return controller.button
    }

}
