package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo.MainActivity2
import com.example.intent.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val usernameEditText = findViewById<EditText>(R.id.edt1)
        val passwordEditText = findViewById<EditText>(R.id.edt2)
        val loginButton = findViewById<Button>(R.id.btn)

        // Setting an onClickListener to the login button
        loginButton.setOnClickListener {
            var i = Intent(this,MainActivity2::class.java)
            startActivity(i)
        }
    }
}