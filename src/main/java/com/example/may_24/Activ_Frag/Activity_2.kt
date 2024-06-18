package com.example.may_24.Activ_Frag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.may_24.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity_2 : AppCompatActivity() {
    private lateinit var bottom_nav:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        bottom_nav =findViewById(R.id.bottom_nav)
        bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.homeFragment -> {Toast.makeText(this,"Home",Toast.LENGTH_LONG).show()
                    supportFragmentManager.beginTransaction().replace(R.id.frag_cont,Fragment_1()).commit()
              }
                R.id.searchFragment -> {Toast.makeText(this,"Search",Toast.LENGTH_LONG).show()}
            }
            true
        }

    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.homeFragment,fragment)
            commit()
        }
}