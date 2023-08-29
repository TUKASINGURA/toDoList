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
        list.add(ActivityModel(R.drawable.music_picture,"Listening_MuSIC","NIGHT TIME","istening to music is a wonderful activity enjoyed by people all over the world. It's not only entertaining but can also have numerous psychological and emotional benefits", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.cooking,"COOKING","MORNING AND AFTERNOON","Cooking is a versatile and creative activity that involves preparing and combining ingredients to create delicious and nutritious meals. It's not only a necessary skill for sustenance but also an enjoyable hobby for many", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.jogging,"JOGGING","NIGHT TIME","Jogging is a popular form of physical activity that involves running at a steady and moderate pace. It is a form of aerobic exercise that provides numerous health benefits and can be enjoyed by people of various fitness levels.", ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.cores,"CHORES","Evening","Completing household tasks like cleaning, laundry, and grocery shopping.",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.personal_care,"PERSONAL CARE","Evening and Evening","Preparing for bed by brushing teeth, washing up, and changing into sleepwear.",
            ActivityStatus.postponed))
        list.add(ActivityModel(R.drawable.socializing,"SOCIALISATION ","WEEKENDS","Spending time with family, friends, or colleagues either in person or virtually",
            ActivityStatus.pending))
        list.add(ActivityModel(R.drawable.computer_repair,"COMPUTER REPAIR","2PM_4PM","LComputer repair refers to the process of diagnosing and resolving issues that can arise in computer hardware, software, or the overall system. These issues can range from simple software glitches to more complex hardware failures. The goal of computer repair is to restore the computer's functionality and ensure it operates smoothly.",
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