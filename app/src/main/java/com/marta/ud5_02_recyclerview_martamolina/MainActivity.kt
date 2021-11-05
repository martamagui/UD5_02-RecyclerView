package com.marta.ud5_02_recyclerview_martamolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}