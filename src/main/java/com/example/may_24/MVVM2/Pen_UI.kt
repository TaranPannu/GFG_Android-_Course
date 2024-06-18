package com.example.may_24.MVVM2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.may_24.MVVM2.retrofit.RetrofitBuilder2
import com.example.may_24.R

class Pen_UI : AppCompatActivity() {
    private lateinit var penViewModel: PenViewModel
    private lateinit var repo5: Repo5
    private lateinit var penViewModelFactory: PenViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pen_ui)
        init()
//        penViewModel = ViewModelProvider(this).get(PenViewModel::class.java)
        penViewModel.PenLiveData.observe(this)
        {
Log.d("s1s",it.toString())
        }

    }

    private fun init(){
        repo5 = Repo5(RetrofitBuilder2.getInstance())
        penViewModelFactory = PenViewModelFactory(repo5)
        penViewModel = ViewModelProvider(this,penViewModelFactory).get(PenViewModel::class.java)
    }
}