package com.example.androidproject

import android.content.Context
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

        val sharedPref=getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor=sharedPref.edit()
        editor.apply{
            putInt(Constants.currentscore.toString(),0)
            intent.putExtra(Constants.currentquestion, 0)
            apply()
        }

        //navigation bar
        binding.navhome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.navboard.setOnClickListener {
            val intent = Intent(this, LeaderboardActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.navcategories.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.navprof.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.navsettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }
        //navigation bar

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