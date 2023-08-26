package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = intent.getIntExtra("image",R.drawable.music_picture)
        val name= intent.getStringExtra("activityName")
        val time= intent.getStringExtra("activityTime")
        val description= intent.getStringExtra("activityDescription")

        val icon= findViewById<ImageView>(R.id.imageViewDescription)
        icon.setImageResource(image)

        val

    }
}