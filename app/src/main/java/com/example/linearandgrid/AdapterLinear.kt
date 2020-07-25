package com.example.linearandgrid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.linear.view.*

class AdapterLinear(private var list: ArrayList<Data2> = arrayListOf<Data2>()) : RecyclerView.Adapter<AdapterLinear.ViewHolderLinear>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderLinear {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.linear, parent, false)
        return ViewHolderLinear(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolderLinear, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolderLinear(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Data2) {
            itemView.Tvtext.text = item.title
            itemView.image.setBackgroundResource(item.image)
        }
    }
}
