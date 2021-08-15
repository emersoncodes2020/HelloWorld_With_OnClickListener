package com.emersonchristina.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById<Button>(R.id.button)
        var myTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0

        btn_click_me.setOnClickListener {
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            makeText1(this@MainActivity, "You clicked me.", LENGTH_SHORT).show()
        }
    }
}