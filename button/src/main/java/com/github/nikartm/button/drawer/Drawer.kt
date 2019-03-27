package com.github.nikartm.button.drawer

import android.view.View

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */
internal abstract class Drawer<T> constructor(private val view: View, private val button: T) {
    abstract fun draw()
}