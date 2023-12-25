package com.example.submissionsilham

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfilActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        findViewById<TextView>(R.id.text_view_name).text = "Ilham Muliawan"

        findViewById<TextView>(R.id.text_view_email).text = "ilhammuliawan25@gmail.com"

        findViewById<ImageView>(R.id.image_view_back).setOnClickListener {
            finish()
        }
    }
}