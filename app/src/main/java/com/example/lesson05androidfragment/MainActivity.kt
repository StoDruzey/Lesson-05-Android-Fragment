package com.example.lesson05androidfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lesson05androidfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addFragment(ListFragment())
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }
}

fun Fragment.pushFragment(counter: Int) {
    (requireActivity() as MainActivity)
        .addFragment(CounterFragment.getInstance(counter))
}