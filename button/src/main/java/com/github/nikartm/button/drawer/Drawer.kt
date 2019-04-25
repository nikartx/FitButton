package com.github.nikartm.button.drawer

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal abstract class Drawer<V, T> constructor(private val view: V, private val button: T) {

    companion object {
        const val MAX_ALPHA = 255
        const val ALPHA_PERCENTS = 75
    }

    /**
     * Draw an element in the view
     */
    abstract fun draw()

    /**
     * Check that an element ready to draw
     */
    abstract fun isReady() : Boolean

    /**
     * Calculation alpha for the button background, border and elements color
     * when state is disabled
     */
    open fun getAlpha() : Float = MAX_ALPHA * ALPHA_PERCENTS / 100f

}