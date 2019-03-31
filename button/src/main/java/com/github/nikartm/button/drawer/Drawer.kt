package com.github.nikartm.button.drawer

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal abstract class Drawer<V, T> constructor(private val view: V, private val button: T) {

    /**
     * Draw an element in the view
     */
    abstract fun draw()

    /**
     * Check that an element ready to draw
     */
    abstract fun isReady() : Boolean

}