package com.example.neighborjob

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PrincipalLogeado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principallogeado)

        val buttonCreateJobMain = findViewById<Button>(R.id.btnCreateJob)

        val buttonAvalaibleJobs = findViewById<Button>(R.id.btnAvalaibleJobs)

        val buttonActiveJobs = findViewById<Button>(R.id.btnActiveJobs)

        val buttonJobHistory = findViewById<Button>(R.id.btnJobHistory)

        buttonCreateJobMain.setOnClickListener{
            val intent = Intent(this, CreateJobMain::class.java)
            startActivity(intent)

        }

        buttonAvalaibleJobs.setOnClickListener{
            val intent = Intent(this, AvalaibleJobs::class.java)
            startActivity(intent)
        }

        buttonActiveJobs.setOnClickListener{
            val intent = Intent(this, ActiveJobs::class.java)
            startActivity(intent)
        }

        buttonJobHistory.setOnClickListener{
            val intent = Intent(this, JobHistory::class.java)
            startActivity(intent)
        }


    }


}
