package com.example.mimobolia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // the views declaration
        val btnshowToast = findViewById<Button>(R.id.btnShowToast);
        val userinputmessage = findViewById<EditText>(R.id.editMessage)
        val btnNavigateToActivity = findViewById<Button>(R.id.messageToNextActivity)

        btnshowToast.setOnClickListener {
            Log.i("Activity" , "The button has been clicked!!");
            Toast.makeText(this , "Button was clicked!!" , Toast.LENGTH_SHORT).show()
        }

        btnNavigateToActivity.setOnClickListener {
            var message : String = userinputmessage.text.toString();
            Toast.makeText(this , message , Toast.LENGTH_LONG).show();

            val intent : Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent);
        }
    }
}