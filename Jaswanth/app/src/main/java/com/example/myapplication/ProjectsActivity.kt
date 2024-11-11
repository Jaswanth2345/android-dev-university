package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProjectsActivity : AppCompatActivity() {

    private lateinit var textViewProjects: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects) // Ensure this matches your XML file name

        textViewProjects = findViewById(R.id.textViewProjects)

        val buttonShowProjects: Button = findViewById(R.id.buttonShowProjects)
        buttonShowProjects.setOnClickListener {
            displayProjects()
        }
    }

    private fun displayProjects() {
        // Prepare the project descriptions
        val projectDetails = """
            Smart Surveillance System
            • Enhances security monitoring by integrating real-time object detection, human pose estimation, and action recognition, allowing for the automatic detection of suspicious activities and immediate alert generation.
            • Utilizes YOLOv8 for object detection, Mediapipe for pose estimation, LSTM for action recognition, OpenCV for video processing, Flask/Django for backend development, and Firebase for real-time notifications and user authentication.
            • Designed to differentiate between violent and non-violent actions captured by the camera, generating real-time alerts for potential threats. Offers mobile access for users to monitor feeds and control the system remotely.

            E-commerce Website Traffic Data
            • Developed a website for online shopping using machine learning techniques.
            • Employed Predictive Analytics to forecast future traffic and conversion rates, allowing for informed marketing decisions and resource allocation.
            • Utilized Clustering algorithms to segment users based on behaviour, enabling targeted marketing campaigns tailored to different customer demographics.
            • Conducted A/B Testing Analysis to evaluate the effectiveness of website changes and marketing strategies, driving data-driven improvements in user engagement and conversion rates.

            Mini Music Player
            • This software program provides users with the capability to select and play music from their personal files, utilizing queues and linked lists as data structures to manage and execute the program's functionality.

            Medical Insurance Analysis
            • This project focuses on analyzing medical insurance data using machine learning techniques to predict costs and identify key factors influencing insurance charges, enabling data-driven insights and improved decision-making.
        """.trimIndent()

        // Set the text to the TextView and make it visible
        textViewProjects.text = projectDetails
        textViewProjects.visibility = View.VISIBLE
    }
}
