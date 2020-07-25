package com.example.linearandgrid

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class AdapterSpinner(context: Context, resource: Int, private val objects: List<Data>) :
    ArrayAdapter<Data>(context, resource, objects) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.spinner, parent, false)
        val tvspinner = view.findViewById<TextView>(R.id.tvspinner)
        tvspinner.text = objects[position].title
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.spinner, parent, false)
        val tvspinner = view.findViewById<TextView>(R.id.tvspinner)
        tvspinner.text = objects[position].title
        return view
    }
}