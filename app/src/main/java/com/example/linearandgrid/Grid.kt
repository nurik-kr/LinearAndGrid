package com.example.linearandgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

private var RecyclerviewG: RecyclerView? = null

class Grid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        setupView()
        setupAdapters()
    }

    private fun setupAdapters() {
        val adapter1 = AdapterGrid(getData())
        RecyclerviewG?.layoutManager = GridLayoutManager(this, 5, RecyclerView.HORIZONTAL, false)
        RecyclerviewG?.adapter = adapter1
    }

    private fun setupView() {
        RecyclerviewG = findViewById(R.id.RecyclerviewG)
    }

    private fun getData(): ArrayList<Data> {
        val data = arrayListOf<Data>()

        for (i in 1..10) {
            data.add(Data(i, "test $i"))
        }
        return data
    }
}