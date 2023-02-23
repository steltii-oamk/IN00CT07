package com.example.harj1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonGoNext: Button =findViewById(R.id.buGoNext)
        val editTextFirst: EditText =findViewById(R.id.etString)
        buttonGoNext.setOnClickListener {
            val etString=editTextFirst.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("key1", etString)
            }
            startActivity(intent)
        }

    }
}