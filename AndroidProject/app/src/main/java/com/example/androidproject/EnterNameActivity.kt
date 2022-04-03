package com.example.androidproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.databinding.ActivityEnterNameBinding
import android.content.Intent;
import android.widget.Toast
import com.example.androidproject.Models.Constants

class EnterNameActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityEnterNameBinding

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

        binding= ActivityEnterNameBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        binding.nameButton.setOnClickListener {
            val newname=binding.etNewname.text.toString();
            editor.apply(){
                putString(Constants.USERNAME,newname)
                apply()
            }
            Toast.makeText(applicationContext, "Welcome "+newname, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}