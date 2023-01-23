package com.example.affirmations.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter( private val context: Context ,private val dataset: List<Affirmation>)
    : RecyclerView.Adapter<ItemAdapter.ItemviewHolder>() {

   class ItemviewHolder( private val view: View) : RecyclerView.ViewHolder(view) {
       val textView : TextView = view.findViewById(R.id.item_title)
       val ImageView : ImageView = view.findViewById(R.id.item_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
           val adapterLayout = LayoutInflater.from(parent.context)
           .inflate(R.layout.list_item,parent,false)
            return ItemviewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {
           val item = dataset[position]
           holder.textView.text = context.resources.getString(item.stringResourceId)
           holder.ImageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}

