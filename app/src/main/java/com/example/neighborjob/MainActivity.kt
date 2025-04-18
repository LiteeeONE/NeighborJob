package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSignIn = findViewById<Button>(R.id.btnSingInVentanaInicial)
        val btnRegister = findViewById<Button>(R.id.btnRegisterVentanaInicial)

        btnSignIn.setOnClickListener {
            Log.e("Botón SignIn", "Presionado")
            val intent = Intent(this, PantallaLogin::class.java)
            startActivity(intent)
        }

        btnRegister.setOnClickListener {
            Log.e("Botón Register", "Presionado")
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}