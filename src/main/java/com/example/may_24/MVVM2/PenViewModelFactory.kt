package com.example.may_24.MVVM2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PenViewModelFactory(private val repo5: Repo5):ViewModelProvider.Factory
{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PenViewModel(repo5) as T
    }
}