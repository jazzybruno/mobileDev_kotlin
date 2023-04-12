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
        val btnshowToast = findViewById<Button>(R.id.btnShowToast);
        val usernameInput = findViewById<EditText>(R.id.editUsername)
        val passwordInput = findViewById<EditText>(R.id.editPassword);
        val btnNavigateToActivity = findViewById<Button>(R.id.messageToNextActivity)

        btnshowToast.setOnClickListener {
            Log.i("Activity" , "The button has been clicked!!");
            Toast.makeText(this , "Button was clicked!!" , Toast.LENGTH_SHORT).show()
        }

        btnNavigateToActivity.setOnClickListener {
            var message : String ? = null;
            var username : String = usernameInput.text.toString();
            var password : String = passwordInput.text.toString();

            if(username == "jazzy" && password == "Bruno@1980"){
                message = "Successfully logged in";
                Toast.makeText(this , message , Toast.LENGTH_LONG).show();

                val intent : Intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username" , username);
                startActivity(intent);
            }else{
                message = "Failed to login"
                Toast.makeText(this , message , Toast.LENGTH_LONG).show();
            }

        }
    }
}