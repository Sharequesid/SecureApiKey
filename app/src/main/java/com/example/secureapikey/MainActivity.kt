package com.example.secureapikey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_sample = findViewById<TextView>(R.id.tv_sample)

        /*val str = BuildConfig.API_KEY
        tv_sample.text = resources.getString(R.string.gmaps_key)*/

        tv_sample.text = BuildConfig.BASE_URL
    }
}