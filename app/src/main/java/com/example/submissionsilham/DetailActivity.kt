package com.example.submissionsilham

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_CHARACTER = "extra_character"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val character = intent.getParcelableExtra<DataClassKarakter>(EXTRA_CHARACTER)

        val imageViewDetail = findViewById<ImageView>(R.id.image_detail)
        val textViewTitle = findViewById<TextView>(R.id.text_view_detail_title)
        val textViewDescription = findViewById<TextView>(R.id.text_view_detail_description)

        if (character != null) {
            Glide.with(this).load(character.image).into(imageViewDetail)
            textViewTitle.text = character.name
            textViewDescription.text = character.deskripsi
        }
    }
}
