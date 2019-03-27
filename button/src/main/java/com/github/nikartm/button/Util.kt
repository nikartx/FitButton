package com.github.nikartm.button

import android.content.res.Resources
import android.util.TypedValue

/**
 * @author Ivan V on 27.03.2019.
 * @version 1.0
 */

fun dpToPx(dp: Float) : Float {
    return TypedValue
            .applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().displayMetrics)
}

fun pxToDp(px : Float) : Float {
    return TypedValue
            .applyDimension(TypedValue.COMPLEX_UNIT_PX, px, Resources.getSystem().displayMetrics)
}

fun txtPxToSp(px : Float) : Float {
    return TypedValue
            .applyDimension(TypedValue.COMPLEX_UNIT_SP, px, Resources.getSystem().displayMetrics)
}

fun getDensity() : Float {
    return Resources.getSystem().displayMetrics.density
}