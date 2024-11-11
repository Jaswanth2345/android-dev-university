//package com.example.myapplication
//
//import android.os.Bundle
//import android.widget.ImageView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//    class CertificatesActivity : AppCompatActivity() {
//        private lateinit var imageViewCertificate1: ImageView
//        private lateinit var imageViewCertificate2: ImageView
//        private lateinit var imageViewCertificate3: ImageView
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_certificates)
//
//            // Initialize the ImageView components
////            imageViewCertificate1 = findViewById(R.id.imageViewCertificate1)
////            imageViewCertificate2 = findViewById(R.id.imageViewCertificate2)
////            imageViewCertificate3 = findViewById(R.id.imageViewCertificate3)
////
////            // Set the images for each certificate (replace with your actual image names)
////            imageViewCertificate1.setImageResource(R.drawable.project) // First certificate image
////            imageViewCertificate2.setImageResource(R.drawable.iintership_certificate) // Second certificate image
////            imageViewCertificate3.setImageResource(R.drawable.hacker_rank_certificate) // Third certificate image
//        }
//    }

package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CertificatesActivity : AppCompatActivity() {
    private lateinit var textViewCertificate1: TextView
    private lateinit var textViewCertificate2: TextView
    private lateinit var textViewCertificate3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certificates)

        // Initialize the TextView components
        textViewCertificate1 = findViewById(R.id.textViewCertificate1)
        textViewCertificate2 = findViewById(R.id.textViewCertificate2)
        textViewCertificate3 = findViewById(R.id.textViewCertificate3)

        // Set text for each certificate (replace with your actual text if needed)
        textViewCertificate1.text = "Project Certificate: Akshay,upgrade" +
                "2022 _2026" +
                "Certificate of course completion "

        textViewCertificate2.text = "Internship Certificate: Certificate of geeks for ggeks for participation"
        textViewCertificate3.text = "HackerRank Certificate: Certificate for participation by xefest"
    }
}
