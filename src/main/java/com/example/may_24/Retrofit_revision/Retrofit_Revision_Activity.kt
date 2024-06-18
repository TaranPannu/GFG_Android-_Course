package com.example.may_24.Retrofit_revision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.example.may_24.R
import com.example.may_24.Retrofit_revision.Data.DataClass
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.withContext

class Retrofit_Revision_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_revision)
        val retro_services = Retro_Builder.get_retro_instance()
        fetchUsers(retro_services)


    }
    fun fetchUsers(retro_services:retroServices) {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val users = retro_services.getAll_Posts()
                withContext(Dispatchers.Main) {
Log.d("s4s", users.body()?.total.toString())                }
            } catch (e: Exception) {
                // Handle errors
            }
        }
    }
}