package com.example.ca_2

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.ca_2.R

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var genderEditText: EditText
    private lateinit var ageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize EditText fields
        nameEditText = findViewById(R.id.editTextName)
        genderEditText = findViewById(R.id.editTextGender)
        ageEditText = findViewById(R.id.editTextAge)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        return when (item.itemId) {
            R.id.action_english -> {
                changeLanguage("English")
                true
            }

            R.id.action_second_language -> {
                changeLanguage("Second Language")
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun changeLanguage(language: String) {
        when (language) {
            "English" -> {
                nameEditText.hint = "Enter Name"
                genderEditText.hint = "Enter Gender"
                ageEditText.hint = "Enter Age"
            }

            "Second Language" -> {
                nameEditText.hint = "नाम दर्ज करें"  // Example in Hindi
                genderEditText.hint = "लिंग दर्ज करें"
                ageEditText.hint = "उम्र दर्ज करें"
            }
        }
        Toast.makeText(this, "Language changed to $language", Toast.LENGTH_SHORT).show()
    }
}
