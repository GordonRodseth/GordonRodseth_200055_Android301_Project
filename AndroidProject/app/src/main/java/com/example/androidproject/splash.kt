package com.example.androidproject
import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.os.Handler
import android.os.HandlerThread
import com.example.androidproject.Models.Constants

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        val sharedPref=getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor=sharedPref.edit()

        var user=sharedPref.getString(Constants.USERNAME,"NO_NAME");
        Handler().postDelayed({
            if(user=="NO_NAME"){
                val intent = Intent(this, EnterNameActivity::class.java)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            finish()
        },3000)
    }


}