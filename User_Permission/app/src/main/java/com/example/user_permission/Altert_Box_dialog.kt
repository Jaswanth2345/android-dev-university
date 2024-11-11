package com.example.user_permission

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Altert_Box_dialog : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_altert_box_dialog)
        var btndialog=findViewById<Button>(R.id.button)
        btndialog.setOnClickListener{
            var b = AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do you want to exit?")
            b.setCancelable(false)
            b.setPositiveButton("Yes"){dialog,_ ->finish()}
            b.setNegativeButton("No"){dialog,_ ->dialog.dismiss()}
            b.setNeutralButton("Neutral"){dialog,_ ->
                run {
                    Toast.makeText(this,"it is neutral button",Toast.LENGTH_SHORT).show()
                }
            }

            b.create().show()

        }
    }
}