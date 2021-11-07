package com.marta.ud5_02_recyclerview_martamolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityMainBinding
import com.marta.ud5_02_recyclerview_martamolina.model.RepositoryResponse
import com.marta.ud5_02_recyclerview_martamolina.model.toRepository

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter : RepositoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvRepositories.layoutManager = LinearLayoutManager(this)
        val app = application as App
        val repositories = app.repositoriesList
        val repositoriesResults = Gson().fromJson(RecyclerFakeData.repositoriesJson, RepositoryResponse::class.java)
        Log.d("mainMsg",(repositoriesResults.size).toString())
        repositories.addAll(listOf(repositoriesResults.toRepository()))
        adapter = RepositoryAdapter(repositories)


    }
}