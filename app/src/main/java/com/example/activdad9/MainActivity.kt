package com.example.activdad9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }
    }
}