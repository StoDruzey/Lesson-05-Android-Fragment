package com.example.lesson05androidfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson05androidfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, ListFragment())
            .commit()
    }
}