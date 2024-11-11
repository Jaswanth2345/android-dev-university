package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class appchooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchooser)
        val sharebtn1:Button=findViewById(R.id.sharebtn)
        val photoes:CheckBox = findViewById(R.id.checkBox1)
        val videos: CheckBox = findViewById(R.id.checkBox2)
        val files: CheckBox = findViewById(R.id.checkBox3)
        val documnts: CheckBox = findViewById(R.id.checkBox4)

        photoes.setOnClickListener {
            sharebtn1.setOnClickListener {
                Sharetxt("hello ,you share photoes")
            }
        }
        videos.setOnClickListener {
            sharebtn1.setOnClickListener {
                Sharetxt("hello ,you share videos")
            }
        }
        files
    }

    fun Sharetxt(s: String) {
        val send:Intent=Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,s)
            type="text/plain"
        }
        val chooser1:Intent=Intent.createChooser(send,"share via")
        startActivity(chooser1)

    }
}