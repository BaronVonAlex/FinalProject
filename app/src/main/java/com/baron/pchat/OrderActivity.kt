package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OrderActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val button = findViewById<Button>(R.id.returnMenuOrderButton)
        button.setOnClickListener {
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }
    }

}