package com.example.hw7_q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_q2.databinding.ActivityMain2Binding
import com.example.hw7_q2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}