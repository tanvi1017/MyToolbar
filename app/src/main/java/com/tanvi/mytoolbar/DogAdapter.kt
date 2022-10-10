package com.tanvi.mytoolbar

import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tanvi.mytoolbar.databinding.RowDogBinding

class DogAdapter(val itemDataList:List<DogItemData>) : RecyclerView.Adapter<DogAdapter.ItemViewHolder>() {
  // step 1. create view hoilder with binding
    inner  class ItemViewHolder(val binding: RowDogBinding): RecyclerView.ViewHolder(binding.root){
    }

    // step 2 initialzie binding like this
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RowDogBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val data = itemDataList[position]
        with(holder){
            binding.ivImage.setImageResource(data.image)
            binding.tvTitle.text = data.title
        }
    }
    override fun getItemCount(): Int {
        return itemDataList.size
    }
}
