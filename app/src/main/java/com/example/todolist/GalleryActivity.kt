package com.example.todolist

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.hardware.camera2.CameraCaptureSession
import android.hardware.camera2.CameraDevice
import android.hardware.camera2.CameraManager
import android.hardware.camera2.CaptureResult
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.provider.MediaStore
import android.util.Log
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class GalleryActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener{

    private val calender= Calendar.getInstance()
    private val formatter= SimpleDateFormat("MMM,dd, YYYY", Locale.US)
    lateinit var handler:Handler
    lateinit var handlerThread: Thread
    lateinit var cameraManager: CameraManager
    lateinit var textView: TextView
    lateinit var cameraCaptureSession: CameraCaptureSession
    lateinit var cameraDevice: CameraDevice
    lateinit var captureResult: CaptureResult
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        get_permission()

        var imageCapture = findViewById<ImageView>(R.id.capture_image)
        cameraManager=getSystemService(Context.CAMERA_SERVICE) as CameraManager
        handlerThread= HandlerThread("videoThread")
        handlerThread.start()
        handler= Handler((handlerThread as HandlerThread).looper)

        imageCapture.setOnClickListener{

        }

//        //start of the activity for the camera action
//        val imageCapture = findViewById<ImageView>(R.id.capture_image)
//        imageCapture.setOnClickListener{
//            dispatchTakePictureIntent()
//
//
//            }
//
//
/////end of activity for the camera action on the application
//

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
//    val REQUEST_IMAGE_CAPTURE = 1
//
//    private fun dispatchTakePictureIntent() {
//        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//        try {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
//        } catch (e: ActivityNotFoundException) {
//            // display error state to the user
//        }
//    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayofMonth: Int) {
        Log.e("calender", "$year==$month==$dayofMonth")
        calender.set(year, month, dayofMonth)
        displayFormattedDate(calender.timeInMillis)
    }
        fun displayFormattedDate(timestamp:Long){
            findViewById<TextView>(R.id.calender).text= formatter.format(timestamp)
            Log.i("formatting",timestamp.toString())
        }
    //function for implemantation of the camera

    fun get_permission(){
        var permissionsLists= mutableListOf<String>()

        if(checkSelfPermission(android.Manifest.permission.CAMERA)!=PackageManager.PERMISSION_GRANTED)permissionsLists.add(android.Manifest.permission.CAMERA)
        if(checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED)permissionsLists.add(android.Manifest.permission.READ_EXTERNAL_STORAGE)
        if(checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED)permissionsLists.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)

        if (permissionsLists.size>0){
            requestPermissions(permissionsLists.toTypedArray(),101)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        grantResults.forEach {
            if (it!=PackageManager.PERMISSION_GRANTED)
                get_permission()
        }
    }
    // the function for implementation of the camera ends here
}