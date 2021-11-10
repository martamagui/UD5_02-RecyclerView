package com.marta.ud5_02_recyclerview_martamolina

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marta.ud5_02_recyclerview_martamolina.databinding.ItemRepositoryBinding
import com.marta.ud5_02_recyclerview_martamolina.model.Repository

class RepositoryAdapter(private val repositories: MutableList<Repository>, val onClickListner:(Repository)->Unit) :
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
        holder.binding.ivRepImg.glideImg(convertUrl(repository.ownerAvatarUrl))
        val onClickListener : View.OnClickListener = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                onClickListner(repository)
            }
        }
        holder.binding.itemView.setOnClickListener(onClickListener)
    }

    override fun getItemCount(): Int {
        return repositories.size
    }

    inner class ViewHolder(val binding: ItemRepositoryBinding) :
        RecyclerView.ViewHolder(binding.root)
}