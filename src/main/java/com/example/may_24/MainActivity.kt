package com.example.may_24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.Btn_1)
        myButton.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
            val i =Intent(applicationContext, MainActivity2::class.java)
            i.putExtra("key","value")
            startActivity(i)
        }

        val lstVw:ListView = findViewById(R.id.lstVw)
        var arr = mutableListOf<String>("Taran","Preet", "Singh","Pannu")
        val adapter =ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)

        lstVw.adapter = adapter

        arr.add("Hello")
        adapter.notifyDataSetChanged()
    }
}