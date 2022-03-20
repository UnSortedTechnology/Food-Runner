package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_register = findViewById<Button>(R.id.button_r)



        btn_register?.setOnClickListener() {
            var etName = findViewById<EditText>(R.id.editTextTextPersonName_r).text.toString()
            var etEmail = findViewById<EditText>(R.id.editTextTextEmailAddress_r).text.toString()
            var etPhone = findViewById<EditText>(R.id.editTextPhone2_r).text.toString()
            var etAddress = findViewById<EditText>(R.id.editTextTextPostalAddress_r).text.toString()
            var etPass = findViewById<EditText>(R.id.editTextTextPassword_r).text.toString()
            var etConfPass = findViewById<EditText>(R.id.editTextTextPassword3_r).text.toString()

            if (!(etName.isNullOrEmpty() && etPhone.isNullOrEmpty() && etEmail.isNullOrEmpty()
                && etAddress.isNullOrEmpty() && etPass.isNullOrEmpty() && etConfPass.isNullOrEmpty())) {

                Toast.makeText(this, "Register Success!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Register Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}