package com.example.may_24.MVVM2

import com.example.may_24.MVVM2.retrofit.RetrofitServices2
import com.example.may_24.Retrofit.RetrofitServices

class Repo5(private val retrofitServices2: RetrofitServices2) {
    suspend fun getAllPens() = retrofitServices2.getAllPens()
}