package com.example.may_24.Retrofit_revision

import com.example.may_24.Retrofit.RetrofitBuilder
import com.example.may_24.Retrofit.RetrofitServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro_Builder {
    companion object {
        var RetroServices:retroServices?=null
       fun get_retro_instance():retroServices
          {
            if(RetroServices == null){

            if(Retro_Builder.RetroServices == null)
             {
                Retro_Builder.RetroServices = Retrofit
                    .Builder()
                    .baseUrl("https://dummyjson.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(retroServices::class.java)
             }
            }
           return Retro_Builder.RetroServices!!
    }
    }
}