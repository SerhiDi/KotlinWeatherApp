package com.example.traziusbiz.kotlinweatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val url: String = "http://api.openweathermap.org/data/2.5/forecast?q=Kiev&mode=json&APPID="
    val API_KEY: String = "8f52968e46bd20e291e0223d691f88da"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            ApiCall.getData(url + API_KEY)
        }

    }

}