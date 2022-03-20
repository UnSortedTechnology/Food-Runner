package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.btn_login)
        val btn_forgot = findViewById<Button>(R.id.btn_loginForgot)
        val btn_register = findViewById<Button>(R.id.btn_loginSignup)

       btn_login?.setOnClickListener(){
           val intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
       }

        btn_forgot?.setOnClickListener(){
            val intent = Intent(this, ForgotActivity::class.java)
            startActivity(intent)
        }

        btn_register?.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onPause() {
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
    }
}