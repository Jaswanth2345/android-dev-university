package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class HobbiesActivity : AppCompatActivity() {
    private lateinit var imageViewHobby1: ImageView
    private lateinit var imageViewHobby2: ImageView
    private lateinit var imageViewHobby3: ImageView
    private lateinit var imageViewHobby4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        imageViewHobby1 = findViewById(R.id.imageViewHobby1)
        imageViewHobby2 = findViewById(R.id.imageViewHobby2)
        imageViewHobby3 = findViewById(R.id.imageViewHobby3)
        imageViewHobby4 = findViewById(R.id.imageViewHobby4)

        imageViewHobby1.setImageResource(R.drawable.img_7)
        imageViewHobby2.setImageResource(R.drawable.img_8)
        imageViewHobby3.setImageResource(R.drawable.img_9)
        imageViewHobby4.setImageResource(R.drawable.img_10)
    }
}
