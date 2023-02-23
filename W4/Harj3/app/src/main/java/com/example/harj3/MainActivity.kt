package com.example.harj3

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var intent: Intent? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun select(view: View?) {
        if (view is Button) {
            when (view.id) {
                R.id.buOamk -> {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://oamk.fi"))
                    startActivity(intent)
                }
                R.id.buMap -> {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.319,65.004?z=14"))
                    try {
                        startActivity(intent)
                    }catch (ex: ActivityNotFoundException){
                        println(ex)
                    }
                }
                R.id.buBauhaus -> {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Bauhaus Oulu"))
                    try {
                        startActivity(intent)
                    }catch (ex: ActivityNotFoundException){
                        println(ex)
                    }
                }
            }
        }
    }
}