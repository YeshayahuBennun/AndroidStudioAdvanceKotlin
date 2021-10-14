package com.ybennun.advancekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val level = EnumCourse.BEGINNER.type

        Log.i("ENUMS","the type is: $level")

        Course().type = EnumCourse.ADVANCE.type
    }
}