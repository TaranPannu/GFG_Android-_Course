package com.example.may_24.Retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.may_24.RecyclerView_ListView.ListViewModel

class PostViewModelFactory (private val repo3: Repo3): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PostsViewModel(repo3) as T
    }
}