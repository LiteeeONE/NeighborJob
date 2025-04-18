package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PantallaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallalogin)

        val textViewSignUp = findViewById<TextView>(R.id.textViewSignUp)
        val buttonLogin = findViewById<Button>(R.id.btnLogin)


        textViewSignUp.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener{
            val intent = Intent(this, PrincipalLogeado::class.java)
            startActivity(intent)
        }

    }


}

