package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CPUActivity: AppCompatActivity() {

    private lateinit var i3button: TextView
    private lateinit var i5button: TextView
    private lateinit var i7button: TextView
    private lateinit var amd1button: TextView
    private lateinit var amd2button: TextView
    private lateinit var returnMenu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpu)

        init()
        listeners()
    }

    private fun init(){
        i3button = findViewById(R.id.i3text)
        i5button = findViewById(R.id.i5text)
        i7button = findViewById(R.id.i7text)
        amd1button = findViewById(R.id.amd1text)
        amd2button = findViewById(R.id.amd2text)
        returnMenu = findViewById(R.id.returnMenuButton)
    }

    private fun listeners(){
        i3button.setOnClickListener {
            startActivity(Intent(this, Inteli3Activity::class.java))
        }

        i5button.setOnClickListener {
            startActivity(Intent(this, Inteli5Activity::class.java))
        }

        i7button.setOnClickListener {
            startActivity(Intent(this, Inteli7Activity::class.java))
        }

        amd1button.setOnClickListener {
            startActivity(Intent(this, Amd1Activity::class.java))
        }

        amd2button.setOnClickListener {
            startActivity(Intent(this, Amd2Activity::class.java))
        }

        returnMenu.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
    }
}