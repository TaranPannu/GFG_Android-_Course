package com.example.may_24.Retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.may_24.R

class RetrofitMainActivity : AppCompatActivity() {
    private lateinit var postsViewModel: PostsViewModel
    private lateinit var postsViewModelFactory: PostViewModelFactory
    private lateinit var repo3: Repo3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_main)

        init()

postsViewModel.postLiveData.observe(this)
{
Log.d("ssd",it.toString())
}
    }

    private fun init(){
        repo3 = Repo3(RetrofitBuilder.getInstance())
        postsViewModelFactory = PostViewModelFactory(repo3)
        postsViewModel = ViewModelProvider(this,postsViewModelFactory).get(PostsViewModel::class.java)
    }
}




