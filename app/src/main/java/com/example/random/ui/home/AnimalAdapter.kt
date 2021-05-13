package com.example.random.ui.home

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.random.model.domain.Animal

class AnimalAdapter(
    private val animals: List<Animal>
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder.itemView as TextView).text =
            animals[position].name + " - " + animals[position].bodyColor
    }

    override fun getItemCount(): Int {
        return animals.size
    }
}

class ViewHolder(itemView: TextView) : RecyclerView.ViewHolder(itemView)