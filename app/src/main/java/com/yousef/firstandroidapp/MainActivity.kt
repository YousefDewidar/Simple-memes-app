package com.yousef.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("housefly", "onCreate: ")

    }

    override fun onResume() {
        super.onResume()
        Log.d("housefly", "onResume: ")

    }

    override fun onPause() {
        super.onPause()
        Log.d("housefly", "onPause: ")

    }


    override fun onRestart() {
        super.onRestart()
        Log.d("housefly", "onRestart: ")


    }


    override fun onStop() {
        super.onStop()
        Log.d("housefly", "onStop: ")

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("housefly", "onDestroy: ")


    }
}