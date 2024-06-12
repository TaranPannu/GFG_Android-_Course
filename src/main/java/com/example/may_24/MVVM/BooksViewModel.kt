package com.example.may_24.MVVM

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BooksViewModel: ViewModel() {
val BooksLivedata = MutableLiveData<List<Book>>()
    fun getAllBooks()
    {
        val allBooks = Repo.getAllBooks()
        BooksLivedata.value = allBooks
    }
    init {
        getAllBooks()
    }
}