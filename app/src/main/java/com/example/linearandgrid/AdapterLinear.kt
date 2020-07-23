package com.example.linearandgrid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.linear.view.*

class AdapterLinear(data: ArrayList<Data>) :
    RecyclerView.Adapter<AdapterLinear.ViewHolderLinear>() {
    private var list = arrayListOf<Data>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderLinear {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid, parent, false)
        return ViewHolderLinear(view)
    }

    override fun getItemCount() = list.size


    override fun onBindViewHolder(holder: ViewHolderLinear, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolderLinear(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Data) {
            itemView.Tvtext.text = item.title
        }
    }
}
