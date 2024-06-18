package com.example.may_24.Retrofit_revision.Data

data class DataClass(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
)