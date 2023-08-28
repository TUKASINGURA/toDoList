package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.data.ActivityAdapter
import com.example.todolist.data.ActivityModel
import com.example.todolist.data.ActivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list=ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","NIGHT TIME","List to the music of my Favorite", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","NIGHT TIME","List to the music of my Favorite", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","NIGHT TIME","List to the music of my Favorite", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","Evening","List to the music of my Favorite",
            ActivityStatus.pending))

        // implementantion of the RecyclerView without the aCTIVITY FOR THE DESCRIPTION At First

//        val activityAdapter= ActivityAdapter(this,list)
//        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.adapter= activityAdapter
//after the RecyclerView has been created it needs to be attached to the layout manager

        val activityAdapter= ActivityAdapter(this,list)
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter= activityAdapter

      //  recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.layoutManager= LinearLayoutManager(this)



    }
}