package com.example.linearandgrid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.grid.view.*

class AdapterGrid(var list: ArrayList<Data> = arrayListOf<Data>()) : RecyclerView.Adapter<AdapterGrid.ViewHolderGrid>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderGrid {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid, parent, false)
        return ViewHolderGrid(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolderGrid, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolderGrid(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Data) {
            itemView.TvtextTwo.text = item.title
        }
    }
}


