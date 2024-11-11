package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val shopping_btn = findViewById<ImageButton>(R.id.imageButton4)
        val grocery_btn = findViewById<ImageButton>(R.id.imageButton5)
        val cstcare_btn = findViewById<ImageButton>(R.id.imageButton6)

        shopping_btn.setOnClickListener {
            Toast.makeText(this, "Welcome to Shopping be happy!", Toast.LENGTH_SHORT).show()
        }
        grocery_btn.setOnClickListener {
            Toast.makeText(this, "Welcome to Grocery Stay healthy!", Toast.LENGTH_SHORT).show()
        }
        cstcare_btn.setOnClickListener {
            Toast.makeText(this, "How may i Help you!", Toast.LENGTH_SHORT).show()
        }
    }
}