package com.example.may_24.RecyclerView_ListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.may_24.R

class Recycler_Activity : AppCompatActivity(), OnItemClickListener {
    lateinit var repo2: Repo2
    lateinit var viewModelFactory: ContactViewModelFactory
    lateinit var viewModel: ListViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        repo2 = Repo2()
        viewModelFactory = ContactViewModelFactory(repo2)
        viewModel = ViewModelProvider(this, viewModelFactory).get(ListViewModel::class.java)

//        var v= arrayOf("HbmbbbbbbhjnI","Hello","jjj","jjjj")
        var rcy=findViewById<RecyclerView>(R.id.RCY)
        rcy.layoutManager =LinearLayoutManager(this)


        viewModel.ListLiveData.observe(this)
        {
            rcy.adapter = Adapter(it,this)
        }


        var btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener(){
            Toast.makeText(applicationContext,"Clicked",Toast.LENGTH_SHORT).show()
            viewModel.addToList("Add to list")
        }


    }

    override fun onItemClick(position: Int) {
        Toast.makeText(applicationContext, "This is a toast message", Toast.LENGTH_SHORT).show()
    }
}