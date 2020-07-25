package com.example.linearandgrid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private var btnInput: Button? = null
    private var spinner: Spinner? = null
    private var currentPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        btnInput = findViewById(R.id.btnInput)
        setupAdaperts()
        setButtonListener()
        setSpinnerListener()
    }


    private fun setupAdaperts() {
        val adapter2r = AdapterSpinner(applicationContext, R.id.tvspinner, Turdata())
        spinner?.adapter = adapter2r
    }


    private fun Turdata(): ArrayList<Data> {
        val data = arrayListOf<Data>()

        data.add(Data(1, "выбери RecylerView " ))
        data.add(Data(2, "Grid"))
        data.add(Data(3, "Linear"))
        return data
    }


    private fun setSpinnerListener() {
        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            )
            {
                currentPosition = position
            }
        }
    }

    private fun setButtonListener() {
        btnInput?.setOnClickListener { startActivity() }
    }

    private fun startActivity() {
        when (currentPosition) {
            1 -> startActivity(Intent(this,Grid::class.java))
            2 -> startActivity(Intent(this,Linear::class.java))

        }

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

}