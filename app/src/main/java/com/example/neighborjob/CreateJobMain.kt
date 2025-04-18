package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class CreateJobMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_createjobmain)


        // Necesito simular crear job e ir a avalaible jobs

        val createJobMain = findViewById<Button>(R.id.AskForHelp)


        createJobMain.setOnClickListener {
            Toast.makeText(this@CreateJobMain, "Job created successfully!", Toast.LENGTH_SHORT).show()
        }

        val btnAvalaibleJobsir = findViewById<Button>(R.id.btnAvalaibleJobs)

        btnAvalaibleJobsir.setOnClickListener{
            val intent = Intent(this, AvalaibleJobs::class.java)
            startActivity(intent)
            

        }


    }
}