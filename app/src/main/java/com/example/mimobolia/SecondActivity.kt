package com.example.mimobolia

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // the views of this
        val textView : TextView = findViewById(R.id.textView)

        var bundle : Bundle ? = intent.extras;
        var msg = bundle!!.getString("username");

        // set the value of the text to the username
        textView.text = msg;
    }
}