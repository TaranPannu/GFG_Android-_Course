package com.example.may_24.Retrofit

data class SampleJsonDataModel(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
)