package com.santhosh.myprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.santhosh.myprogresslibrary.CustomProgressDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomProgressDialog().show(this,"Welcome..")

        Handler(Looper.getMainLooper()).postDelayed({
            // Dismiss progress bar after 5 seconds
            CustomProgressDialog().dialog.dismiss()
        }, 5000)
    }
}