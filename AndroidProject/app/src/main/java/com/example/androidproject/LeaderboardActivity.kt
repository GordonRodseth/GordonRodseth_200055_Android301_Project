package com.example.androidproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.databinding.ActivityLeaderboardBinding
import android.content.Intent;
import com.example.androidproject.Models.Constants

class LeaderboardActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityLeaderboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding= ActivityLeaderboardBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val sharedPref=getSharedPreferences("myPref", Context.MODE_PRIVATE)
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

        val highscore=sharedPref.getInt(Constants.HIGH_SCORE.toString(),0);
        val user=sharedPref.getString(Constants.HIGH_SCORE_USER,"");
        val category=sharedPref.getString(Constants.TOP_CATEGORY,"");


        binding.score.text=highscore.toString() ;
        binding.user.text=user;
        binding.category.text=category;


    }
}