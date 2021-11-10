package com.marta.ud5_02_recyclerview_martamolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityMainBinding
import com.marta.ud5_02_recyclerview_martamolina.model.toRepository
import com.marta.ud5_02_recyclerview_martamolina.model.RepositoryResponse as RepositoryResponse

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: RepositoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvRepositories.layoutManager = LinearLayoutManager(this)
        binding.rvRepositories.visibility = View.GONE
        val app = application as App
        val repositories = app.repositoriesList
        val repositoriesResults = Gson().fromJson(
            RecyclerFakeData.repositoriesJson, Array<RepositoryResponse>::class.java
        )
        repositories.addAll(repositoriesResults.toRepository())
        adapter = RepositoryAdapter(repositories) { repository ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("repository", repository.id)
            startActivity(intent)
        }
        binding.rvRepositories.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
        binding.rvRepositories.visibility = View.VISIBLE
    }
}


