package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shesvla: Button = findViewById (R.id.button)
        val gamosvla: Button = findViewById(R.id.button2)

        shesvla.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
    }
        gamosvla.setOnClickListener {
            finishAffinity()
        }
}
}