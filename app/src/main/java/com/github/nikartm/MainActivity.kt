package com.github.nikartm

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.github.nikartm.button.FitButton

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
                .setTextSize(20f)
                .setIconMarginStart(16f)
                .setIconMarginEnd(12f)
                .setTextColor(Color.parseColor("#F5F5F5"))
                .setIconColor(Color.parseColor("#FFE0B2"))
                .setDividerColor(Color.parseColor("#BCAAA4"))
                .setBorderColor(Color.parseColor("#FFF59D"))
                .setButtonColor(Color.parseColor("#FF7043"))
                .setBorderWidth(2f)
                .setRippleEnable(true)
                .setRippleColor(resources.getColor(R.color.colorAccent))
                .setOnClickListener {
                    Toast.makeText(this,
                            "Click on ${fitButton?.getText()}",
                            Toast.LENGTH_SHORT).show()
                }
    }

}
