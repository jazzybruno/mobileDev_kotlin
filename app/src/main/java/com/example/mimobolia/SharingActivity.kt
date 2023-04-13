package com.example.mimobolia

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SharingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        val btnshowToast = findViewById<Button>(R.id.btnShowToast);
        val usernameInput = findViewById<EditText>(R.id.editUsername)
        val btnNavigateToActivity = findViewById<Button>(R.id.messageToNextActivity);
        val btnShareOutside : Button = findViewById(R.id.btnShareWithApps);
        val usrmessageToShare : EditText = findViewById(R.id.usrmessageToShare);

        btnshowToast.setOnClickListener {
            Log.i("Activity" , "The button has been clicked!!");
            Toast.makeText(this , "Button was clicked!!" , Toast.LENGTH_SHORT).show()
        }

        btnNavigateToActivity.setOnClickListener {
            var message : String ? = null;
            var username : String = usernameInput.text.toString();

                message = "Successfully logged in";
                Toast.makeText(this , message , Toast.LENGTH_LONG).show();
                val intent : Intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username" , username);
                startActivity(intent);
        }

        btnShareOutside.setOnClickListener {
            var message = usrmessageToShare.text.toString();
            val intent : Intent = Intent();
            intent.action = Intent.ACTION_SEND;
            intent.putExtra(Intent.EXTRA_TEXT , message);
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent , "Please Select the App: "))

            Toast.makeText(this , "Please Choose the App" , Toast.LENGTH_LONG ).show();

        }

    }
}