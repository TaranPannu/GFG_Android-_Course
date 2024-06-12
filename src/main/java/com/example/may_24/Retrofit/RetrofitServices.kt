package com.example.may_24.Retrofit

import retrofit2.Response
import retrofit2.http.GET

interface RetrofitServices {

    @GET("/posts")
    suspend fun getAllPosts(): Response<SampleJsonDataModel>

}