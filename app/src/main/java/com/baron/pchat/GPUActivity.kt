package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GPUActivity: AppCompatActivity() {

    private lateinit var amd1button: TextView
    private lateinit var amd2button: TextView
    private lateinit var nvidia1button: TextView
    private lateinit var nvidia2button: TextView
    private lateinit var returnMenu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gpu)

        init()
        listeners()
    }

    private fun init(){
        amd1button = findViewById(R.id.amdgpu1text)
        amd2button = findViewById(R.id.amdgpu2text)
        nvidia1button = findViewById(R.id.nvidiagpu1text)
        nvidia2button = findViewById(R.id.nvidiagpu2text)
        returnMenu = findViewById(R.id.returnMenuButton)
    }

    private fun listeners(){

        amd1button.setOnClickListener {
            startActivity(Intent(this, Amd1GpuActivity::class.java))
        }

        amd2button.setOnClickListener {
            startActivity(Intent(this, Amd2GpuActivity::class.java))
        }

        nvidia1button.setOnClickListener {
            startActivity(Intent(this, Nvidia1Activity::class.java))
        }

        nvidia2button.setOnClickListener {
            startActivity(Intent(this, Nvidia2Activity::class.java))
        }

        returnMenu.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
    }
}