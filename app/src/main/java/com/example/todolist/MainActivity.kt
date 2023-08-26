package com.example.todolist

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList=binding.mylist

        val countryList= listOf("Rwanda","Uganda","USA","Burundi","Kenya","DRC","Zambia")


        val arrayAdapter= ArrayAdapter(this, R.layout.list_item_layout, R.id.TextVeiw,countryList)
        myList.adapter= arrayAdapter
    }
}