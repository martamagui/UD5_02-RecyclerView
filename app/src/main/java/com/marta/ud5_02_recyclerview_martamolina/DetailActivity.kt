package com.marta.ud5_02_recyclerview_martamolina

import android.content.Context
import android.content.Intent
import android.net.Uri
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
        if (repoId == null) {
            notFound()
        } else {
            val repository = app.repositoriesList.firstOrNull { repoId == it.id }
            repository.let {
                binding.ivDetailRepImg.glideImg(repository?.ownerAvatarUrl)
                binding.tvDetailRepositoryName.text =
                    if (!repository?.name.isNullOrEmpty()) repository?.name else binding.tvDetailRepositoryName.text
                binding.tvDetailDescription.text =
                    if (!repository?.description.isNullOrEmpty()) repository?.description else binding.tvDetailDescription.text
                binding.tvDetaillLicense.text =
                    if (!repository?.licenseName.isNullOrEmpty()) "License: " + repository?.licenseName else binding.tvDetaillLicense.text
                binding.tvDetaillTopics.text =
                    if (!repository?.topics.isNullOrEmpty()) topicsToHastags(repository?.topics) else binding.tvDetaillTopics.text
                binding.fakeChipLanguaje.text =
                    if (!repository?.language.isNullOrEmpty()) repository?.language else binding.fakeChipLanguaje.text
                binding.tvUserName.text =
                    if (!repository?.ownerName.isNullOrEmpty()) "@"+repository?.ownerName else binding.tvUserName.text
                binding.tvUserName.setOnClickListener {
                    val intentProfile = Intent(Intent.ACTION_VIEW)
                    intentProfile.data = Uri.parse(convertUrl(repository?.ownerProfile))
                    startActivity(intentProfile)
                }

            } ?: notFound()
        }
    }

    private fun notFound() {
        Toast.makeText(
            this,
            "User not found, go back to MainActivity :)",
            Toast.LENGTH_SHORT
        ).show()
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