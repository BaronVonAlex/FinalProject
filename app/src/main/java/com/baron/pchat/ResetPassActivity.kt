package com.baron.pchat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class ResetPassActivity: AppCompatActivity() {

    private lateinit var forgotpassMail : EditText
    private lateinit var forgotPassButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resetpassword)
        init()
    }
    private fun init(){
        forgotpassMail = findViewById(R.id.resetMail)
        forgotPassButton = findViewById(R.id.resetPassButton)

        forgotPassButton.setOnClickListener {
            val email = forgotpassMail.text.toString()

            if (email.isEmpty()){
                Toast.makeText(this,"Email is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                .addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        startActivity(Intent(this,LoginActivity::class.java))
                        Toast.makeText(this,"Mail was sent", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}