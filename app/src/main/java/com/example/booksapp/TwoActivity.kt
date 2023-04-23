package com.example.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.databinding.ActivityTwoBinding
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class TwoActivity : AppCompatActivity() {

    lateinit var binding: ActivityTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pdfShow.fromAsset("sariqdevniolimii.pdf").defaultPage(0).scrollHandle(
            DefaultScrollHandle(this)
        )
            .spacing(10).load()

    }
}