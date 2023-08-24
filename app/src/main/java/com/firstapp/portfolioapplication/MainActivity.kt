package com.firstapp.portfolioapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val and var
        val buttonSkills = findViewById<Button>(R.id.btnSkills)


        buttonSkills.setOnClickListener {
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }

        val buttonEducation=findViewById<Button>(R.id.btnEdu)

        buttonEducation.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        val buttonWork=findViewById<Button>(R.id.btnWork)
        buttonWork.setOnClickListener {
            intent=Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }

        val buttonAchieve=findViewById<Button>(R.id.btnAchieve)
        buttonAchieve.setOnClickListener {
            intent=Intent(this,AchieveActivity::class.java)
            startActivity(intent)
        }

    }
}