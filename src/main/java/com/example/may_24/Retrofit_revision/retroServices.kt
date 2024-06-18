package com.example.may_24.Retrofit_revision

import com.example.may_24.Retrofit.SampleJsonDataModel
import com.example.may_24.Retrofit_revision.Data.DataClass
import retrofit2.Response
import retrofit2.http.GET

interface retroServices {
    @GET("/posts")
    suspend fun getAll_Posts(): Response<DataClass>
}