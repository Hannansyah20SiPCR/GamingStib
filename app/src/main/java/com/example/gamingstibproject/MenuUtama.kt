package com.example.gamingstibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuutama)

        val storeimg = findViewById<ImageView>(R.id.storeimg)
        val libraryimg = findViewById<ImageView>(R.id.libraryimg)
        val locimg = findViewById<ImageView>(R.id.locimg)
        val aboutimg = findViewById<ImageView>(R.id.aboutimg)

        val Image1 = findViewById<ImageView>(R.id.storeimg)
        storeimg.setOnClickListener {
            val intent = Intent ( this, CategoryGame::class.java)
            startActivity(intent)
        }
        val Image2 = findViewById<ImageView>(R.id.locimg)
        locimg.setOnClickListener {
            val intent = Intent ( this, MapsActivity::class.java)
            startActivity(intent)
        }
        val Image3 = findViewById<ImageView>(R.id.libraryimg)
        libraryimg.setOnClickListener {
            val intent = Intent ( this, Library::class.java)
            startActivity(intent)
        }
        val Image4 = findViewById<ImageView>(R.id.aboutimg)
        aboutimg.setOnClickListener {
            val intent = Intent ( this, About::class.java)
            startActivity(intent)
        }
    }
}