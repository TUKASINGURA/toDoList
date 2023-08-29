package com.example.todolist

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class GalleryActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener{

    private val calender= Calendar.getInstance()
    private val formatter= SimpleDateFormat("MMM,dd, YYYY", Locale.US)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val datePicker= findViewById<TextView>(R.id.textView)
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

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayofMonth: Int) {
        Log.e("calender", "$year==$month==$dayofMonth")
        calender.set(year, month, dayofMonth)
        displayFormattedDate(calender.timeInMillis)
    }
        fun displayFormattedDate(timestamp:Long){
            findViewById<TextView>(R.id.textView).text= formatter.format(timestamp)
            Log.i("formatting",timestamp.toString())
        }
}