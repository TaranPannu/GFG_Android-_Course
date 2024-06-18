package com.example.may_24.MVVM2.retrofit

data class DataModelX(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
)