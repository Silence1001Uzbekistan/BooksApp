package com.example.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.databinding.ActivityThreeBinding
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class ThreeActivity : AppCompatActivity() {

    lateinit var binding: ActivityThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.pdfShow.fromAsset("yulduzlitunlarr.pdf").defaultPage(0).scrollHandle(
            DefaultScrollHandle(this)
        )
            .spacing(10).load()

    }
}