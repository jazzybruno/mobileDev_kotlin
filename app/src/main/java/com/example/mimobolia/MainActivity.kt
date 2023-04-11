package com.example.mimobolia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnshowToast = findViewById<Button>(R.id.btnShowToast);
        btnshowToast.setOnClickListener {
            Log.i("Activity" , "The button has been clicked!!");
            Toast.makeText(this , "Button was clicked!!" , Toast.LENGTH_SHORT).show()
        }
    }
}