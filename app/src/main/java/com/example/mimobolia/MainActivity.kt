package com.example.mimobolia

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // the views declaration
       val sharingData : Button = findViewById(R.id.sharingData);
        val recylerView : Button = findViewById(R.id.recylerView);

        sharingData.setOnClickListener {
            val intent : Intent = Intent(this , SharingActivity::class.java);
            startActivity(intent);
        }

        recylerView.setOnClickListener {
            val intent : Intent = Intent(this , HobbiesActivity::class.java);
            startActivity(intent);
        }
    }
}