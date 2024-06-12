package com.example.may_24.RecyclerView_ListView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel(private val repo: Repo2):ViewModel() {

    val ListLiveData= MutableLiveData<List<String>>()
    fun getAllList () {
        val allList = repo.getAllList()
        ListLiveData.value = allList
    }

    fun addToList(x:String) {
        repo.addToList(x)
    }
    init {
        getAllList()
    }
}

