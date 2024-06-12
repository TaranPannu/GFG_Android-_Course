package com.example.may_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val i = getIntent()
        var st:String = i.getStringExtra("key").toString()
        val txtVw:TextView = findViewById(R.id.txtView)
        txtVw.text=st



    }
}