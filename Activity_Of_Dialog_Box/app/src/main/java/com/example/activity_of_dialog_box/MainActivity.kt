package com.example.activity_of_dialog_box

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val languages = arrayOf("English", "Russian", "French", "German", "Italian")

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Select a Language")

        val dialogView: View = LayoutInflater.from(this).inflate(R.layout.activity_main, null)
        builder.setView(dialogView)
        val listView: ListView = dialogView.findViewById(R.id.list1)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedLanguage = languages[position]
            Toast.makeText(this, "Selected: $selectedLanguage", Toast.LENGTH_SHORT).show()
        }
        val dialog = builder.create()
        dialog.show()
    }
}