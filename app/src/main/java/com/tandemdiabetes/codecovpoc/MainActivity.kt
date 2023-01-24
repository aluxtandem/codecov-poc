package com.tandemdiabetes.codecovpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val utility = Utility()

        val addResult = utility.add(12, 34)

        Log.d(TAG, "add result $addResult")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}