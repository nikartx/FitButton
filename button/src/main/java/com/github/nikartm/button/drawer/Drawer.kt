package com.github.nikartm.button.drawer

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal abstract class Drawer<V, T> constructor(private val view: V, private val button: T) {
    abstract fun draw()
}