package com.example.androidproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.widget.Toast
import com.example.androidproject.Models.Constants
import com.example.androidproject.databinding.ActivityQuestionOneBinding

class QuestionActivityOne : AppCompatActivity() {
    private  lateinit var binding:ActivityQuestionOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityQuestionOneBinding.inflate(layoutInflater)
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

        var currentQuestion = intent?.extras?.getInt(Constants.currentquestion, 1)
        var score = sharedPref.getInt(Constants.currentscore.toString(), 0)



        var questions= Constants.getQuestionsOne()

        var question=questions[currentQuestion!!-1]

        binding.question.text = question.question
        binding.optionOneText.text = question.optionOne
        binding.optionTwoText.text = question.optionTwo
        binding.optionThreeText.text = question.optionThree
        binding.optionFourText.text = question.optionFour

        title="Question: "

        binding.optionOne.setOnClickListener {
            if(currentQuestion < 4){
                val intent=Intent(this,QuestionActivityOne::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
                val newscore=Constants.currentscore+1;
                editor.apply{
                    putInt(Constants.currentscore.toString(), newscore)
                    apply()
                }
                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 4)
            {
                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ Constants.currentscore, Toast.LENGTH_SHORT).show()
                if(Constants.currentscore > Constants.HIGH_SCORE1){
                    editor.apply{
                        putInt(Constants.HIGH_SCORE1.toString(), Constants.currentscore)
                        putString(Constants.HIGH_SCORE1_USER, Constants.USERNAME)
                        apply()
                    }
                }

                startActivity(intent)

                finish()
            }
        }


        binding.optionTwo.setOnClickListener {

            if(currentQuestion < 4){
                val intent=Intent(this,QuestionActivityOne::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)

                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 4)
            {
                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ Constants.currentscore, Toast.LENGTH_SHORT).show()
                if(Constants.currentscore > Constants.HIGH_SCORE1){
                    editor.apply{
                        putInt(Constants.HIGH_SCORE1.toString(), Constants.currentscore)
                        putString(Constants.HIGH_SCORE1_USER, Constants.USERNAME)
                        apply()
                    }
                }

                startActivity(intent)

                finish()
            }



        }
        binding.optionThree.setOnClickListener {

            if(currentQuestion < 4){
                val intent=Intent(this,QuestionActivityOne::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)

                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 4)
            {
                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ Constants.currentscore, Toast.LENGTH_SHORT).show()
                if(Constants.currentscore > Constants.HIGH_SCORE1){
                    editor.apply{
                        putInt(Constants.HIGH_SCORE1.toString(), Constants.currentscore)
                        putString(Constants.HIGH_SCORE1_USER, Constants.USERNAME)
                        apply()
                    }
                }

                startActivity(intent)

                finish()
            }


        }
        binding.optionFour.setOnClickListener {

            if(currentQuestion < 4){
                val intent=Intent(this,QuestionActivityOne::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)

                startActivity(intent)
                finish()
            }
            if(currentQuestion >= 4)
            {
                val intent=Intent(this,MainActivity::class.java)
                Toast.makeText(applicationContext, "Your Score is: "+ Constants.currentscore, Toast.LENGTH_SHORT).show()
                if(Constants.currentscore > Constants.HIGH_SCORE1){
                    editor.apply{
                        putInt(Constants.HIGH_SCORE1.toString(), Constants.currentscore)
                        putString(Constants.HIGH_SCORE1_USER, Constants.USERNAME)
                        apply()
                    }
                }

                startActivity(intent)

                finish()
            }


        }
    }
}