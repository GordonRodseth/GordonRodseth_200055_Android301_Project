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

        val sharedPref=getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor=sharedPref.edit()
        editor.apply{
            putInt(Constants.currentscore.toString(),0)
            intent.putExtra(Constants.currentquestion, 0)
            apply()
        }

        var highscore1=sharedPref.getInt(Constants.HIGH_SCORE1.toString(), 0)
        var highscore2=sharedPref.getInt(Constants.HIGH_SCORE2.toString(), 0)
        var highscore3=sharedPref.getInt(Constants.HIGH_SCORE3.toString(), 0)

        var user1=sharedPref.getString(Constants.HIGH_SCORE1_USER, "N/A")
        var user2=sharedPref.getString(Constants.HIGH_SCORE2_USER, "N/A")
        var user3=sharedPref.getString(Constants.HIGH_SCORE3_USER, "N/A")

        binding= ActivityLeaderboardBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

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

        binding.score1.text= highscore1.toString();
        binding.score2.text=highscore2.toString();
        binding.score3.text=highscore3.toString();

        binding.user1.text=user1;
        binding.user2.text=user2;
        binding.user3.text=user3;
    }
}