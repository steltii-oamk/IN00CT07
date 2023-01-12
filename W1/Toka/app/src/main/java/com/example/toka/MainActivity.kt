package com.example.toka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.buClick)
        val myMessage: TextView = findViewById(R.id.tvMsg)
        val toast = Toast.makeText(this,"Toast tervehtii!",Toast.LENGTH_SHORT)
        myButton.setOnClickListener{
            myMessage.text="Tervehdys!"
            toast.show()
        }
    }
}