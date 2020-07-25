package com.example.linearandgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

private var RecyclerviewL: RecyclerView? = null

class Linear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
        setupView()
        setupAdapters()
    }

    private fun setupView() {
        RecyclerviewL = findViewById(R.id.RecyclerviewL)
    }

    private fun setupAdapters() {
        val data = arrayListOf<Data2>()
        for (i in 1..100) {
            data.add(Data2("1$i", R.id.imageTwo))
            val adapter = AdapterLinear(data)
            RecyclerviewL?.adapter = adapter
        }
    }
}
