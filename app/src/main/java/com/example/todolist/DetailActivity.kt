package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
val floating= findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floating.setOnClickListener{
            startActivity(Intent(this,GalleryActivity::class.java))
        }

        val image = intent.getIntExtra("image",R.drawable.music_picture)
        val name= intent.getStringExtra("activityName")
        val time= intent.getStringExtra("activityTime")
        val description= intent.getStringExtra("activityDescription")

        val button= intent.getStringExtra("activityStatus")

        val icon= findViewById<ImageView>(R.id.imageViewDescription)
        icon.setImageResource(image)

        val activity= findViewById<TextView>(R.id.activityDescription)
        activity.text=name

        val timeDescription= findViewById<TextView>(R.id.timeDescription)
        timeDescription.text=time

        val activityDescription= findViewById<TextView>(R.id.description)
        activityDescription.text=description
//
//        val buttondescription= findViewById<Button>(R.id.button)
//        buttondescription.text=button
    }
}