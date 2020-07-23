package com.example.linearandgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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

        val adapter = AdapterLinear(getData())
        RecyclerviewL?.adapter = adapter
        RecyclerviewL?.setLayoutManager(LinearLayoutManager(applicationContext));//dopisal v inete nashel
    }

    private fun getData(): ArrayList<Data> {
        val data = arrayListOf<Data>()

        for (i in 1..10) {
            data.add(Data(i,"test $i"))
        }
        return data
    }
}