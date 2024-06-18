package com.example.may_24.MVVM2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.may_24.MVVM2.retrofit.DataModelX
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PenViewModel(private val repo5:Repo5):ViewModel() {

    val PenLiveData = MutableLiveData<DataModelX>()

    fun getAllPens()
    {
        viewModelScope.launch ( Dispatchers.IO) {

            val allPens = repo5.getAllPens()
            if (allPens.isSuccessful) {
                PenLiveData.postValue(allPens.body())
            }
        }
        }

    init {
        getAllPens()
    }
}