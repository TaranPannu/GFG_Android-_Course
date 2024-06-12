package com.example.may_24.MVVM

object Repo {
    fun getAllBooks() = listOf<Book>(
        Book(BookName = "Harry Potter")
,       Book(BookName = "Harry Potter2"),
        Book(BookName = "Harry Potter3")
    )


}