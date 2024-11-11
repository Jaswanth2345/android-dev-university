package com.example.user_permission

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Custom_Dialog : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_dialog)
      var b=findViewById<Button>(R.id.button)
        b.setOnClickListener{
            var d= LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            val g=AlertDialog.Builder(this).setView(d)
            g.setPositiveButton("Subscribe"){dialog,_ ->
                val e=d.findViewById<EditText>(R.id.editTextTextEmailAddress)
                val email=e.text.toString()
                if(email.isNotBlank()){
                    Toast.makeText(this,"Subscribed with $email",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"enter valid email",Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            g.setNegativeButton("cancel"){dialog,_ ->dialog.dismiss()}
            g.create().show()
        }
    }
}