package com.dam2.ciclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO hacer log en start
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onCreate")
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy onStart")
    }
}