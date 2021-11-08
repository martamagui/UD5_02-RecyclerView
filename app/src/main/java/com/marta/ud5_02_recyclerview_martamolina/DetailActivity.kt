package com.marta.ud5_02_recyclerview_martamolina

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val repoId = intent.extras?.getString(ARG_REPOSITORY_ID)
        if (repoId == null){
            Toast.makeText(this, "User not found, go back to MainActivity :)", Toast.LENGTH_SHORT).show()
        }else{

        }

    }
    companion object{
        private const val ARG_REPOSITORY_ID = "repository"

        @JvmStatic
        fun start(context: Context, reposotyId: String) {
            val starter = Intent(context, DetailActivity::class.java)
                starter.putExtra(ARG_REPOSITORY_ID, reposotyId)
            context.startActivity(starter)
        }
    }
}