package com.github.nikartm.button

import android.util.AttributeSet
import android.view.View
import com.github.nikartm.button.drawer.ContainerDrawer
import com.github.nikartm.button.drawer.DividerDrawer
import com.github.nikartm.button.drawer.IconDrawer
import com.github.nikartm.button.drawer.TextDrawer
import com.github.nikartm.button.model.FButton

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
internal class DrawManager constructor(view: View, attrs : AttributeSet?) {

    private val controller = AttributeController(view, attrs)

    private val container = ContainerDrawer(view, controller.button)
    private val icon = IconDrawer(view, controller.button)
    private val divider = DividerDrawer(view, controller.button)
    private val text = TextDrawer(view, controller.button)

    companion object Create {
        fun init(view: View, attrs : AttributeSet): DrawManager {
            return DrawManager(view, attrs)
        }
    }

    /**
     * Draw customized [FitButton] on [View]
     */
    fun drawButton() : DrawManager {
        container.draw()
        icon.draw()
        divider.draw()
        text.draw()
        return this
    }

    /**
     * @return [FButton] with attrs or default values
     */
    fun getButton() : FButton {
        return controller.button
    }

}
