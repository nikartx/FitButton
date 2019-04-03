package com.github.nikartm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

import com.github.nikartm.button.FitButton

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private var fitButton: FitButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fitButton = findViewById(R.id.fbtn)
        Log.d(TAG, "onCreate: " + fitButton!!.getIconWidth())
    }

}
