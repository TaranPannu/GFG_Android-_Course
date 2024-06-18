package com.example.may_24.Retrofit

class Repo3(private val retrofitServices: RetrofitServices) {
suspend fun getAllPosts() = retrofitServices.getAllPosts()
}
