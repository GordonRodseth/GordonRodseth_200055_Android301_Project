package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.databinding.ActivityMainBinding
import android.content.Intent;
import com.example.androidproject.Models.Constants

class MainActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view=binding.root
        setContentView(view)

        binding.playButton.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra(Constants.currentquestion, 1)
            startActivity(intent)
            finish()
        }
    }
}