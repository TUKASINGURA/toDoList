package com.example.todolist

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class GalleryActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener{

    private val calender= Calendar.getInstance()
    private val formatter= SimpleDateFormat("MMM,dd, YYYY", Locale.US)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        //start of the activity for the camera action
        val imageCapture = findViewById<ImageView>(R.id.capture_image)
        imageCapture.setOnClickListener{
            dispatchTakePictureIntent()
            }

        
///end of activity for the camera action on the application

        val datePicker= findViewById<TextView>(R.id.calender)
        datePicker.setOnClickListener{
            DatePickerDialog(
                this,
                this,
                calender.get(Calendar.YEAR),
                calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH)
            ) .show()
        }
    }
    val REQUEST_IMAGE_CAPTURE = 1

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            // display error state to the user
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayofMonth: Int) {
        Log.e("calender", "$year==$month==$dayofMonth")
        calender.set(year, month, dayofMonth)
        displayFormattedDate(calender.timeInMillis)
    }
        fun displayFormattedDate(timestamp:Long){
            findViewById<TextView>(R.id.calender).text= formatter.format(timestamp)
            Log.i("formatting",timestamp.toString())
        }
}