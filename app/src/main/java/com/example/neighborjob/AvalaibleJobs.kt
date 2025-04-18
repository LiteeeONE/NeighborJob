package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AvalaibleJobs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_avalaiblejobs)


        val selectJobmain = findViewById<Button>(R.id.selectJob)

        selectJobmain.setOnClickListener {
            Toast.makeText(this@AvalaibleJobs, "Job taken successfully!", Toast.LENGTH_SHORT).show()
        }

        val btnGoBack = findViewById<Button>(R.id.btnGoBack)

        btnGoBack.setOnClickListener{
            val intent = Intent(this, PrincipalLogeado::class.java)
            startActivity(intent)

        }


    }
}