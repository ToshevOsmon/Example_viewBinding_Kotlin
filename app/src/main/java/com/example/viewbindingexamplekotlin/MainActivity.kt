package com.example.viewbindingexamplekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.viewbindingexamplekotlin.databinding.ActivityMainBinding

 lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvmain.text = "Salom bu view Binding"

        binding.openFragmint.setOnClickListener {

            openFragment()
        }

    }


    private fun openFragment() {

        var fragment = MyFragment()
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding!!.layoutFragment.id, fragment)
        fragmentTransaction.commit()
    }
}