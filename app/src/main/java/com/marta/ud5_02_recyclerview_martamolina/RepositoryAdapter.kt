package com.marta.ud5_02_recyclerview_martamolina

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityMainBinding
import com.marta.ud5_02_recyclerview_martamolina.databinding.ItemRepositoryBinding
import com.marta.ud5_02_recyclerview_martamolina.model.Repository

class RepositoryAdapter(repositories: MutableList<Repository>): RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(val binding: ItemRepositoryBinding) : RecyclerView.ViewHolder(binding.root)

}