package com.example.myapplicationcalculadorakotlinpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        implementation 'com.google.firebase:firebase-storage:19.2.0'
    }
}