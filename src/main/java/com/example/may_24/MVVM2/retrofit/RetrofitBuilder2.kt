package com.example.may_24.MVVM2.retrofit

import com.example.may_24.Retrofit.RetrofitServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder2 {

    companion object {
        var retrofitServices2: RetrofitServices2? = null
        fun getInstance(): RetrofitServices2 {
            if (retrofitServices2 == null) {
                retrofitServices2 = Retrofit.Builder().baseUrl("https://dummyjson.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(RetrofitServices2::class.java)
            }
            return retrofitServices2!!
        }
    }
}