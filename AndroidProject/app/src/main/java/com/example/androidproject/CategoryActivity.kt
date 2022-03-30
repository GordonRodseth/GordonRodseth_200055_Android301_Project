package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.databinding.ActivityCategoryBinding
import android.content.Intent
import com.example.androidproject.Models.Constants

class CategoryActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityCategoryBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.Category1.setOnClickListener{
            val intent = Intent(this, QuestionActivityOne::class.java)
            intent.putExtra(Constants.currentquestion, 1)
            startActivity(intent)
            finish()
        }
        binding.Category2.setOnClickListener{
            val intent = Intent(this, QuestionActivityTwo::class.java)
            intent.putExtra(Constants.currentquestion, 1)
            startActivity(intent)
            finish()
        }
        binding.Category3.setOnClickListener{
            val intent = Intent(this, QuestionActivityThree::class.java)
            intent.putExtra(Constants.currentquestion, 1)
            startActivity(intent)
            finish()
        }
    }
}