package com.marta.ud5_02_recyclerview_martamolina

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val repoId = intent.extras?.getString(ARG_REPOSITORY_ID)
        if (repoId == null) {
            Toast.makeText(this, "User not found, go back to MainActivity :)", Toast.LENGTH_SHORT)
                .show()
        } else {
            val repository = app.repositoriesList.firstOrNull { repoId == it.id }
            if (repository==null){
                Toast.makeText(this, "User not found, go back to MainActivity :)", Toast.LENGTH_SHORT)
                    .show()
            }else{
                Glide.with(binding.ivDetailRepImg.context)
                    .load(repository.ownerAvatarUrl)
                    .placeholder(R.drawable.resource_default)
                    .into(binding.ivDetailRepImg)
                binding.tvDetailRepositoryName.text = repository.name
                binding.tvDetailDescription.text = repository.description
                binding.tvDetaillLicense.text = repository.licenseName
                var topics: String = "Tags: \n"
                for(item in 0..repository.topics.size){
                    topics+=" #$repository[item] \n"
                }
                binding.tvDetaillTopics.text = topics
                binding.chipLanguaje.text = repository.language
            }
        }

    }

    companion object {
        private const val ARG_REPOSITORY_ID = "repository"

        @JvmStatic
        fun start(context: Context, reposotyId: String) {
            val starter = Intent(context, DetailActivity::class.java)
            starter.putExtra(ARG_REPOSITORY_ID, reposotyId)
            context.startActivity(starter)
        }
    }
}