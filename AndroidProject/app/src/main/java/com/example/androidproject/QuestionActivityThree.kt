package com.example.androidproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.os.Vibrator
import android.widget.Toast
import com.example.androidproject.Models.Constants
import com.example.androidproject.databinding.ActivityQuestionThreeBinding

class QuestionActivityThree : AppCompatActivity() {
    private  lateinit var binding:ActivityQuestionThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityQuestionThreeBinding.inflate(layoutInflater)
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

        val sharedPref=getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor=sharedPref.edit()

        var currentQuestion = intent?.extras?.getInt(Constants.currentquestion, 0)
        var currentScore = intent?.extras?.getInt(Constants.currentscore, 0)

        val highscore=sharedPref.getInt(Constants.HIGH_SCORE.toString(),0);
        val user=sharedPref.getString(Constants.USERNAME,"");

        var questions= Constants.getQuestionsThree()

        var question=questions[currentQuestion!!]

        binding.question.text = question.question
        binding.optionOneText.text = question.optionOne
        binding.optionTwoText.text = question.optionTwo
        binding.optionThreeText.text = question.optionThree
        binding.optionFourText.text = question.optionFour

        title="Question: "

        binding.optionOne.setOnClickListener {
            val vibrator=getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
            if(vibrator.hasVibrator()) {
                vibrator.vibrate(100)
            }
            if(currentQuestion < 5){
                val intent=Intent(this,QuestionActivityThree::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
                intent.putExtra(Constants.currentscore, currentScore!!+1)
                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 5)
            {
                var uscore =currentScore!!+1;
                intent.putExtra(Constants.currentscore, currentScore!!+1)
                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ uscore, Toast.LENGTH_SHORT).show()

                if((currentScore!!+1)> highscore!!){
                    Toast.makeText(applicationContext, "NEW HIGH SCORE", Toast.LENGTH_SHORT).show()
                    editor.apply{
                        putInt(Constants.HIGH_SCORE.toString(), uscore)
                        putString(Constants.HIGH_SCORE_USER, user.toString())
                        putString(Constants.TOP_CATEGORY, "Amazing Abductions")
                        apply()
                    }

                }

                startActivity(intent)

                finish()
            }
        }


        binding.optionTwo.setOnClickListener {
            var uscore= currentScore!!.toInt();
            val vibrator=getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
            if(vibrator.hasVibrator()) {
                vibrator.vibrate(100)
            }
            if(currentQuestion < 5){
                val intent=Intent(this,QuestionActivityThree::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)

                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 5)
            {

                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ uscore, Toast.LENGTH_SHORT).show()
                if (currentScore != null) {
                    if(currentScore> Constants.HIGH_SCORE!!){
                        Toast.makeText(applicationContext, "NEW HIGH SCORE", Toast.LENGTH_SHORT).show()
                        editor.apply{
                            putInt(Constants.HIGH_SCORE.toString(), currentScore)
                            putString(Constants.HIGH_SCORE_USER, user.toString())
                            putString(Constants.TOP_CATEGORY, "Amazing Abductions")
                            apply()
                        }
                    }
                }

                startActivity(intent)

                finish()
            }



        }
        binding.optionThree.setOnClickListener {
            var uscore = currentScore!!.toInt();
            val vibrator=getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
            if(vibrator.hasVibrator()) {
                vibrator.vibrate(100)
            }
            if (currentQuestion < 5) {
                val intent = Intent(this, QuestionActivityThree::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!! + 1)

                startActivity(intent)
                finish()
            }
            if (currentQuestion >= 5) {

                val intent = Intent(this, MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: " + uscore, Toast.LENGTH_SHORT)
                    .show()
                if (currentScore != null) {
                    if (currentScore > Constants.HIGH_SCORE!!) {
                        Toast.makeText(applicationContext, "NEW HIGH SCORE", Toast.LENGTH_SHORT)
                            .show()
                        editor.apply {
                            putInt(Constants.HIGH_SCORE.toString(), currentScore)
                            putString(Constants.HIGH_SCORE_USER, user.toString())
                            putString(Constants.TOP_CATEGORY, "Amazing Abductions")
                            apply()
                        }
                    }
                }

                startActivity(intent)

                finish()
            }
        }
        binding.optionFour.setOnClickListener {
            var uscore= currentScore!!.toInt();
            val vibrator=getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
            if(vibrator.hasVibrator()) {
                vibrator.vibrate(100)
            }
            if(currentQuestion < 5){
                val intent=Intent(this,QuestionActivityThree::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)

                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 5)
            {

                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ uscore, Toast.LENGTH_SHORT).show()
                if (currentScore != null) {
                    if(currentScore> Constants.HIGH_SCORE!!){
                        Toast.makeText(applicationContext, "NEW HIGH SCORE", Toast.LENGTH_SHORT).show()
                        editor.apply{
                            putInt(Constants.HIGH_SCORE.toString(), currentScore)
                            putString(Constants.HIGH_SCORE_USER, user.toString())
                            putString(Constants.TOP_CATEGORY, "Amazing Abductions")
                            apply()
                        }
                    }
                }

                startActivity(intent)

                finish()
            }


        }
    }
}