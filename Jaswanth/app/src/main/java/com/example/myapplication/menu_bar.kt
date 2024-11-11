package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.R


class menu_bar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar)

        // Set up the Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)  // Enables the back button on the toolbar

        // Initialize ImageButtons and set their click listeners
        val imageButtonAcademics = findViewById<ImageButton>(R.id.imageButton)
        val imageButtonCertifications = findViewById<ImageButton>(R.id.imageButton2)
        val imageButtonHobbies = findViewById<ImageButton>(R.id.imageButton3)
        val imageButtonProjects = findViewById<ImageButton>(R.id.imageButton4)
        val imageButtonGallery = findViewById<ImageButton>(R.id.imageButton5)
        val imageButtonSkills = findViewById<ImageButton>(R.id.imageButton6)

        // Set click listeners for each button
        imageButtonAcademics.setOnClickListener {
            val intent = Intent(this, academics::class.java)
            startActivity(intent)
        }

        imageButtonCertifications.setOnClickListener {
            val intent = Intent(this, CertificatesActivity::class.java)
            startActivity(intent)
        }

        imageButtonHobbies.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

        imageButtonProjects.setOnClickListener {
            val intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }

        imageButtonGallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                type = "image/*"
            }
            startActivity(intent)
        }

        imageButtonSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            // Handle each menu option
            R.id.i1 -> {
                // Opens the Gmail app for email
                val emailIntent = Intent(Intent.ACTION_MAIN).apply {
                    addCategory(Intent.CATEGORY_APP_EMAIL)
                    setPackage("com.google.android.gm")  // Opens specifically in Gmail
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                }
                startActivity(emailIntent)
                true
            }
            R.id.i2 -> {
                // Opens the dialer with a preset phone number
                val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:912178106")
                }
                startActivity(dialIntent)
                true
            }
            R.id.i3 -> {
                // Opens a feedback form in the browser
                val url = "https://docs.google.com/forms/d/e/1FAIpQLSfc6J4ihcXh9Le-QNQ6K0yDU9X4xaUI5CJ66eDhRPLsYmRbeA/viewform"
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(browserIntent)
                true
            }
            android.R.id.home -> {
                // Handle the back button in the toolbar
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
