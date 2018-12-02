package com.example.traziusbiz.kotlinweatherapp

import okhttp3.*
import java.io.IOException

class ApiCall {

    companion object {
        private val client = OkHttpClient()

        fun getData(url: String) {
            val request = Request.Builder()
                .url(url)
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onResponse(call: Call, response: Response) {
                    println(response.body()!!.string())
                }

                override fun onFailure(call: Call, e: IOException) {}
            })

        }

    }
}