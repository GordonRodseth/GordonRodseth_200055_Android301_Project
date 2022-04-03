package com.example.androidproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.databinding.ActivitySettingsBinding
import android.content.Intent;
import android.widget.Toast
import com.example.androidproject.Models.Constants

class SettingsActivity : AppCompatActivity() {
    private  lateinit var binding:ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPref=getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor=sharedPref.edit()

        editor.apply{
            putInt(Constants.currentscore.toString(),0)
            intent.putExtra(Constants.currentquestion, 0)
            apply()
        }

        var user=sharedPref.getString(Constants.USERNAME, "N/A")

        binding= ActivitySettingsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        binding.clearButton.setOnClickListener {
            Toast.makeText(applicationContext, "Scores cleared", Toast.LENGTH_SHORT).show()
            editor.apply(){
                putInt(Constants.currentscore.toString(),0)
                putInt(Constants.HIGH_SCORE.toString(),0)

                putString(Constants.HIGH_SCORE_USER, null)

                putString(Constants.TOP_CATEGORY, null)

                apply()
            }
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

    }
}