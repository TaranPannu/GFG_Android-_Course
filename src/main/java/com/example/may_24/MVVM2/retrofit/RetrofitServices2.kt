package com.example.may_24.MVVM2.retrofit

import com.example.may_24.Retrofit.SampleJsonDataModel
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitServices2 {
    @GET("/posts")
    suspend  fun getAllPens(): Response<DataModelX>

}