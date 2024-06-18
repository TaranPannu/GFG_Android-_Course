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
/**
 * 1:ViewModelProvider(this):
This creates a ViewModelProvider object.
The this argument refers to the current activity (Book_UI in this case).
This is important because it tells the provider to associate the ViewModel with the lifecycle of the activity.

2:.get(PenViewModel::class.java):
This method does two main things:
Retrieves existing ViewModel: It checks if a BookViewModel instance already exists for this activity.
If it does, it returns that existing instance.
This is crucial for surviving configuration changes (like screen rotation) because the ViewModel instance will be retained and reused.
Creates new ViewModel: If no existing BookViewModel is found, it creates a new instance
using the provided class (BookViewModel::class.java).*/
        BooksViewModel1.BooksLivedata.observe(this)
        {
            Log.d("yt12","hello")
        }
    }
}