package com.github.nikartm.button

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.widget.LinearLayout

/**
 * @author Ivan V on 25.03.2019.
 * @version 1.0
 */
class FitButton : LinearLayout {

    private lateinit var manager: DrawManager

    constructor(context: Context) : super(context) {
        bind(null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        bind(attrs)
    }

    private fun bind(attrs: AttributeSet?) {
        manager = DrawManager(this, attrs).drawButton()
    }

}
