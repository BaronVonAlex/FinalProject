package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    private lateinit var cpuButton : Button
    private lateinit var gpuButton : Button
    private lateinit var logoutButton : Button
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listeners()
        init()
    }

    private fun listeners(){
        cpuButton = findViewById(R.id.cpuButton)
        gpuButton = findViewById(R.id.gpuButton)
        logoutButton = findViewById(R.id.logoutButton)
        profileButton = findViewById(R.id.profileButton)
    }

    private fun init(){

        cpuButton.setOnClickListener {
            startActivity(Intent(this, CPUActivity::class.java))
        }

        gpuButton.setOnClickListener {
            startActivity(Intent(this, GPUActivity::class.java))
        }

        logoutButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        profileButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
