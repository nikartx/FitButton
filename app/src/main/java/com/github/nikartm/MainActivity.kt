package com.github.nikartm

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.nikartm.button.FitButton
import com.github.nikartm.button.model.Shape

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private var fitButton: FitButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButton()
    }

    private fun setupButton() {
        fitButton = findViewById(R.id.fbtn)
        fitButton!!
                .setTextFont(R.font.share_tech_regular)
                .setWidth(200)
                .setHeight(70)
                .setTextSize(20f)
                .setIconMarginStart(16f)
                .setIconMarginEnd(12f)
                .setTextColor(Color.parseColor("#F5F5F5"))
                .setIconColor(Color.parseColor("#FFFFFF"))
                .setDividerColor(Color.parseColor("#BCAAA4"))
                .setBorderColor(Color.parseColor("#FFF59D"))
                .setButtonColor(Color.parseColor("#FF7043"))
                .setBorderWidth(2f)
                .setRippleEnable(true)
                .setRippleColor(resources.getColor(R.color.colorAccent))
                .setOnClickListener {
//                    changeButton()
                    Toast.makeText(this,
                            "Click on ${fitButton?.getText()}",
                            Toast.LENGTH_SHORT).show()
                }
    }

    private fun changeButton() {
        fitButton?.setButtonShape(Shape.CIRCLE)
                ?.setDividerVisibility(View.GONE)
                ?.setTextVisibility(View.GONE)
    }

}
