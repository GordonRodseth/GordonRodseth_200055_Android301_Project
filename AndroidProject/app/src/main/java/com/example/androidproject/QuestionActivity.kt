package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.databinding.ActivityMainBinding
import android.content.Intent;
import com.example.androidproject.Models.Constants
import com.example.androidproject.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding=ActivityQuestionBinding.inflate()
        setContentView(R.layout.activity_question)


        var currentQuestion = intent?.extras?.getInt(Constants.currentquestion, 1)

        var questions= Constants.getAllQuestions()

        var question=questions[currentQuestion!!-1]

        binding.question.setText(question.question)
        binding.optionOne.setText(question.optionOne)
        binding.optionTwo.setText(question.optionTwo)
        binding.optionThree.setText(question.optionThree)
        binding.optionFour.setText(question.optionFour)

        title="Question: "+question.id;

        binding.optionOne.setOnClickListener {

            val intent=Intent(this,QuestionActivity::class.java)
            intent.putExtra(Constants.currentquestion, currentQuestion!!+1)

        }
    }
}