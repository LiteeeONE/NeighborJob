package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnSignIn = findViewById<Button>(R.id.btnLogin)

        val btnRegisterEmployeer = findViewById<TextView>(R.id.textViewSignUp)

        btnSignIn.setOnClickListener {
            Log.e("Botón SignIn", "Presionado")
            val intent = Intent(this, PantallaLogin::class.java)
            startActivity(intent)
        }

        btnRegisterEmployeer.setOnClickListener{
            val intent = Intent(this, RegisterEmployeer::class.java)
            startActivity(intent)

            }


        }


    }


