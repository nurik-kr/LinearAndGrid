package com.example.linearandgrid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

private var spinner: Spinner? = null
private var btnInput: Button? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupClics()
    }

    private fun setupView() {
        spinner = findViewById(R.id.spinner)
        btnInput = findViewById(R.id.btnInput)
    }
    private fun setupClics() {
        btnInput?.setOnClickListener {
            val intent = Intent(applicationContext,Linear::class.java)
            startActivity(intent)
        }
    }
}