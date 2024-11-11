package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class academics : AppCompatActivity() {

    private lateinit var textViewAcademics: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_academics2) // Ensure this matches your XML file name

        textViewAcademics = findViewById(R.id.textViewAcademics)

        val buttonShowAcademics: Button = findViewById(R.id.buttonShowAcademics)
        buttonShowAcademics.setOnClickListener {
            displayAcademics()
        }
    }

    private fun displayAcademics() {
        val academicsDetails = """
            Academics::
            
            Degree: Bachelor of Science in Computer Science
            
            University: Lovely Professional University
            
            Graduation Year: 2026
            
            CGPA: 8.04
            
            10th Marks: 70%
            
            12th Marks: 79%
            
            Key Subjects: Machine Learning, Data Structures, Cloud Computing
            
            
            Future Plans: Interested in pursuing a Master's in Artificial Intelligence
        """.trimIndent()

        textViewAcademics.text = academicsDetails
        textViewAcademics.visibility = View.VISIBLE
    }
}
