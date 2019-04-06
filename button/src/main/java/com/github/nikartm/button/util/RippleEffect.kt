package com.github.nikartm.button.util

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.StateListDrawable
import android.os.Build
import android.view.View

/**
 * Ripple effect for the [FitButton]
 * @author Ivan V on 03.04.2019.
 * @version 1.0
 */
class RippleEffect {

    companion object {
        fun createRipple(view: View, enableRipple: Boolean = true,
                         normalColor: Int, rippleColor: Int,
                         corner: Float,
                         container: GradientDrawable) {

            if (enableRipple) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    val mask = GradientDrawable()
                    mask.cornerRadius = pxToDp(corner)
                    mask.setColor(Color.GRAY)

                    val colors = ColorStateList(arrayOf(intArrayOf(android.R.attr.state_enabled)),
                            intArrayOf(rippleColor))
                    val rd = RippleDrawable(colors, container, mask)
                    view.background = rd
                } else {
                    val sd = StateListDrawable()
                    val statePressed = intArrayOf(android.R.attr.state_pressed)
                    val stateNormal = intArrayOf(android.R.attr.state_enabled)

                    val pressed = GradientDrawable()
                    pressed.setColor(rippleColor)
                    pressed.cornerRadius = corner

                    container.setColor(normalColor)
                    container.cornerRadius = corner

                    sd.addState(statePressed, pressed)
                    sd.addState(stateNormal, container)
                    view.background = sd
                }
            } else {
                view.background = container
            }
        }
    }

}