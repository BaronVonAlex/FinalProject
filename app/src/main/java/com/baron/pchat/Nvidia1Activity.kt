package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Nvidia1Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nvidiagpu1)

        val button = findViewById<Button>(R.id.orderButton)
        button.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
            finish()
        }
    }

}