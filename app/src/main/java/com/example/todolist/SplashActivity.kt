package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
////the handler takes two paremeters the first paremeter for the the
//        //the activity you are on and were you are going
//        // the second paremeter is the time the splash screen will stay on for some time
//        Handler().postDelayed({
//            startActivity(Intent(this,MainActivity::class.java))
 //             finish()
//        },
//            3500
//        )

  //      CoroutineScope does the same thing as the the Handler
        val scope= CoroutineScope(Dispatchers.Main)

        scope.launch {
            delay(3500)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        }

    }
}