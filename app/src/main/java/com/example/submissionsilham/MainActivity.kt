package com.example.submissionsilham

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvKarakter: RecyclerView
    private val list = ArrayList<DataClassKarakter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKarakter = findViewById(R.id.recycle_view)
        rvKarakter.layoutManager = LinearLayoutManager(this)
        val karakterData = KarakterData()
        rvKarakter.adapter = KarakterAdapter(karakterData.listKarakter)

        val imageButtonProfile = findViewById<ImageButton>(R.id.image_button_profile)
        imageButtonProfile.setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }

    }
}