package com.example.may_24.Retrofit

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PostsViewModel( private val repo3:Repo3):ViewModel() {
val postLiveData = MutableLiveData<SampleJsonDataModel>()

    init {
        getAllPosts()
    }
    fun getAllPosts(){
        viewModelScope.launch ( Dispatchers.IO){
            val response = repo3.getAllPosts()
            if(response.isSuccessful)
            {
                postLiveData.postValue(response.body())
            }
        }
    }
}