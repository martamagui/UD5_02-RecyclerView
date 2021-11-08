package com.marta.ud5_02_recyclerview_martamolina

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marta.ud5_02_recyclerview_martamolina.databinding.ActivityMainBinding
import com.marta.ud5_02_recyclerview_martamolina.databinding.ItemRepositoryBinding
import com.marta.ud5_02_recyclerview_martamolina.model.Repository

class RepositoryAdapter(private val repositories: MutableList<Repository>) :
    RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRepositoryBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repository = repositories[position]
        holder.binding.tvRepName.text = repository.name
        holder.binding.tvRepDescription.text = repository.description
        val url: String = (repository.ownerAvatarUrl).replace(" ", "")
        Glide.with(holder.binding.ivRepImg.context)
            .load(url)
            .placeholder(R.drawable.resource_default)
            .into(holder.binding.ivRepImg)
    }

    override fun getItemCount(): Int {
        return repositories.size
    }

    inner class ViewHolder(val binding: ItemRepositoryBinding) :
        RecyclerView.ViewHolder(binding.root)
}