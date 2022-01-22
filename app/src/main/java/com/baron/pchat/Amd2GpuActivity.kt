package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Amd2GpuActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amdgpu2)

        val button = findViewById<Button>(R.id.orderButton)
        button.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
            finish()
        }
    }

}