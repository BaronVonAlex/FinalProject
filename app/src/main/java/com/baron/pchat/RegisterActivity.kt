package com.baron.pchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerMail: EditText
    private lateinit var registerPassword: EditText
    private lateinit var registerUsername: EditText
    private lateinit var registerButton: Button
    private lateinit var registerLoginButton: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()
    }

    private fun init(){
        mAuth = FirebaseAuth.getInstance()
        registerMail = findViewById(R.id.registerMail)
        registerPassword = findViewById(R.id.registerPassword)
        registerUsername = findViewById(R.id.registerUsername)
        registerButton = findViewById(R.id.registerButton)
        registerLoginButton = findViewById(R.id.registerLoginButton)
        supportActionBar?.hide()

        registerButton.setOnClickListener {
            val username = registerUsername.text.toString()
            val email = registerMail.text.toString()
            val password = registerPassword.text.toString()

            if (email.isEmpty() || password.isEmpty() || username.isEmpty()){
                Toast.makeText(this,"Blanks are empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        Toast.makeText(this,"Account was created",Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this,LoginActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}