package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import com.example.androidproject.Models.Constants
import com.example.androidproject.databinding.ActivityQuestionTwoBinding

class QuestionActivityTwo : AppCompatActivity() {
    private  lateinit var binding:ActivityQuestionTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityQuestionTwoBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        var currentQuestion = intent?.extras?.getInt(Constants.currentquestion, 1)
        var score = intent?.extras?.getInt(Constants.score, 0)

        var questions= Constants.getQuestionsTwo()

        var question=questions[currentQuestion!!-1]

        binding.question.text = question.question
        binding.optionOneText.text = question.optionOne
        binding.optionTwoText.text = question.optionTwo
        binding.optionThreeText.text = question.optionThree
        binding.optionFourText.text = question.optionFour

        title="Question: "

        binding.optionOne.setOnClickListener {
            if(currentQuestion < 4){
            val intent=Intent(this,QuestionActivityTwo::class.java)
            intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
            intent.putExtra(Constants.score, score!!+1)
            startActivity(intent)
            finish()
            }
            if(currentQuestion >= 4)
            {
                val intent=Intent(this,MainActivity::class.java)
                intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
                intent.putExtra(Constants.score, score!!+1)
                Toast.makeText(applicationContext, "Your Score is: "+score, Toast.LENGTH_SHORT)
                startActivity(intent)

                finish()
            }
        }


        binding.optionTwo.setOnClickListener {

            val intent=Intent(this,QuestionActivityTwo::class.java)
            intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
            startActivity(intent)
            finish()

        }
        binding.optionThree.setOnClickListener {

            val intent=Intent(this,QuestionActivityTwo::class.java)
            intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
            startActivity(intent)
            finish()

        }
        binding.optionFour.setOnClickListener {

            val intent=Intent(this,QuestionActivityTwo::class.java)
            intent.putExtra(Constants.currentquestion, currentQuestion!!+1)
            startActivity(intent)
            finish()

        }
    }
}