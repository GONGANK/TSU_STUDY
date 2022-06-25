package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Continuewithoutlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continuewithoutlogin)

        val button1 = findViewById<ImageView>(R.id.imageView8)
        val button2 = findViewById<TextView>(R.id.textView12)
        val button3 = findViewById<TextView>(R.id.textView7)
        val button4 = findViewById<TextView>(R.id.textView13)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, Contactus::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, Aboutus::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, Privace::class.java)
            startActivity(intent)
        }

    }
}