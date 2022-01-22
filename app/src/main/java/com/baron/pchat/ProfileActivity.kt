package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profileMail = findViewById<TextView>(R.id.userEmail)
        profileMail.text = FirebaseAuth.getInstance().currentUser?.email

        val button = findViewById<Button>(R.id.back)
        button.setOnClickListener {
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }
    }
}