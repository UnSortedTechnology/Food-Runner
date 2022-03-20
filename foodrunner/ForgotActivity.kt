package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val btn_next = findViewById<Button>(R.id.button_next)



        btn_next?.setOnClickListener() {
            var etPhone = findViewById<EditText>(R.id.editTextPhone_forgot).text.toString()
            var etEmail = findViewById<EditText>(R.id.editTextTextEmailAddress_forgot).text.toString()

            if (!(etPhone.isNullOrEmpty() && etEmail.isNullOrEmpty())) {
                Toast.makeText(this, "Reset Success!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Reset Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}