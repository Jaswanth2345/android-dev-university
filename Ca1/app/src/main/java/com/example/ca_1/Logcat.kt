package com.example.ca_1

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Logcat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logcat)
        var btnlogentry=findViewById<Button>(R.id.button)
        btnlogentry.setOnClickListener{
            Log.v(TAG,"Verbose log:lowest priority, detailed entry, no use during product")
        Log.d(TAG,"Debug log: hiest priority ,thi is used to debug the app")
                Log.i(TAG,"Info log:moderate level importance,they give information")
                Log.w(TAG,"Warning log:This is a warning message for unexpected behaviour")

            Toast.makeText(this, "Logs have been generated!", Toast.LENGTH_SHORT).show()
        }

    }
}


