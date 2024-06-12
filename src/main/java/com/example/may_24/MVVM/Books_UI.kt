package com.example.may_24.MVVM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.may_24.R

class Books_UI : AppCompatActivity() {
    private lateinit var BooksViewModel1: BooksViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_ui)

        BooksViewModel1 = ViewModelProvider(this).get(BooksViewModel::class.java)

        BooksViewModel1.BooksLivedata.observe(this)
        {
            Log.d("yt12","hello")
        }
    }
}