package com.example.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageOne.setOnClickListener {

            startActivity(Intent(this, OneActivity::class.java))

        }

        binding.imageTwo.setOnClickListener {

            startActivity(Intent(this, TwoActivity::class.java))

        }

        binding.imageThree.setOnClickListener {

            startActivity(Intent(this, ThreeActivity::class.java))

        }

    }
}