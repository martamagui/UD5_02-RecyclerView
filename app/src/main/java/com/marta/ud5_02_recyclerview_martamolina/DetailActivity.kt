package com.marta.ud5_02_recyclerview_martamolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}