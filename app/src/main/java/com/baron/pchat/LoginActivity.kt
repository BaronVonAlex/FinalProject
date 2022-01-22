package com.baron.pchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var loginMail: EditText
    private lateinit var loginPassword: EditText
    private lateinit var loginButton: Button
    private lateinit var loginRegisterButton: Button
    private lateinit var forgotPassButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        listeners()
        init()
    }

    private fun listeners(){
        loginMail = findViewById(R.id.loginMail)
        loginPassword = findViewById(R.id.loginPassword)
        loginButton = findViewById(R.id.loginButton)
        loginRegisterButton = findViewById(R.id.loginRegisterButton)
        forgotPassButton = findViewById(R.id.forgotPassword)
        supportActionBar?.hide()
    }

    private fun init(){
        loginButton.setOnClickListener {
            val email = loginMail.text.toString()
            val password = loginPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Fill blanks", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        startActivity(Intent(this,MenuActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Password or Mail is incorrect", Toast.LENGTH_SHORT).show()
                    }
                }
        }
        loginRegisterButton.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
        forgotPassButton.setOnClickListener {
            startActivity(Intent(this,ResetPassActivity::class.java))
        }
    }
}