package com.example.linearandgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.grid.*

private var RecyclerviewG: RecyclerView? = null

class Grid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        setupView()
        setupAdapters()
    }

    private fun setupView() {
        RecyclerviewG = findViewById(R.id.RecyclerviewG)
    }

    private fun setupAdapters() {
        val adapter1 = AdapterGrid(getData())
        RecyclerviewG?.layoutManager = GridLayoutManager(applicationContext, 5)
        RecyclerviewG?.adapter = adapter1
    }

    private fun getData(): ArrayList<Data> {
        val data = arrayListOf<Data>()
        for (i in 1..100) {
            data.add(Data(i, "data $i"))
        }
        return data
    }

}