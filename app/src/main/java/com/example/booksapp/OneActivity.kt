package com.example.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.databinding.ActivityOneBinding
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class OneActivity : AppCompatActivity() {

    lateinit var binding: ActivityOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pdfShow.fromAsset("sariqdevniminib.pdf").defaultPage(0).scrollHandle(
            DefaultScrollHandle(this)
        )
            .spacing(10).load()

    }
}