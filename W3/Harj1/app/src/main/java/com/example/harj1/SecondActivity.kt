package com.example.harj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView = findViewById<TextView>(R.id.tvSecond)
        var extras: Bundle? = intent.extras
        var string = extras!!.getString("key1")
        textView.setText(string)
    }
}