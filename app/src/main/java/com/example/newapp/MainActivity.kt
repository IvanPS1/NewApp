package com.example.newapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.newapp.databinding.ActivityLearnWordBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLearnWordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearnWordBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }

    }