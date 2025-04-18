package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class ActiveJobs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_activejobs)


        val btnAddJob = findViewById<Button>(R.id.btnAddJob)

        btnAddJob.setOnClickListener{
            val intent = Intent(this, CreateJobMain::class.java)
            startActivity(intent)


        }




    }
}