package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SkillsActivity : AppCompatActivity() {

    private lateinit var textViewSkills: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        textViewSkills = findViewById(R.id.textViewSkills)

        val buttonShowSkills: Button = findViewById(R.id.buttonShowSkills)
        buttonShowSkills.setOnClickListener {
            displaySkills()
        }
    }

    private fun displaySkills() {
        // Prepare the skills descriptions
        val skillsDetails = """
            Skills:
            •  Programming Language: Python, SQL, HTML, CSS, Java (Data Structures & Algorithms), C
            
            
            •  Data Science &ML Library: Pandas, NumPy, Scikit-learn, Matplotlib, Seaborn, Plotly, Folium, Beautiful soup, Selenium,TensorFlow, Statsmodels, OpenCV, NLTK, PyTorch
            
            
            • Framework & Tool: Tableau, Microsoft Office
            
            
            • Soft skills: Organized, Time Management, Work Effective, Flexible, Adaptive, Collaboration
        """.trimIndent()

        // Set the text to the TextView and make it visible
        textViewSkills.text = skillsDetails
        textViewSkills.visibility = View.VISIBLE
    }
}
