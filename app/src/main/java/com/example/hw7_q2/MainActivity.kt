package com.example.hw7_q2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw7_q2.databinding.ActivityMainBinding
const val q1 = "Beijing is the capital of China" //TRUE
const val q2 = "Oslo is the capital of Brazil" //WRONG
const val q3 = "Norway is on the American continent"     //WRONG
const val q4 = "Djibouti is on the African continent"   //TRUE
const val q5 = "Stockholm is the capital of Sweden"   //TRUE
const val q6 = "The Americas are larger than Asia"     //WRONG
const val q7 = "Africa is the second largest continent in the world"  //TRUE
const val q8 = "The smallest country in the world is the Vatican"    //TRUE
const val q9 = "Antarctica is the largest country in the world"   //WRONG
const val q10 = "Russia is the third largest country in the world"     //WRONG
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cheatButton.setOnClickListener{
            cheat()
        }
        binding.questionBox.text =q1.toString()
        binding.Truebuttton.setOnClickListener{
            trueAnswer()
        }
        binding.FalseButton.setOnClickListener{
            wrongAnswer()
        }
        binding.questionBox.text =q2.toString()
        binding.Truebuttton.setOnClickListener{
          wrongAnswer()
        }
        binding.FalseButton.setOnClickListener{
           trueAnswer()
        }
        binding.questionBox.text =q3.toString()
        binding.Truebuttton.setOnClickListener{
            wrongAnswer()
        }
        binding.FalseButton.setOnClickListener{
            trueAnswer()
        }
        binding.questionBox.text =q4.toString()
        binding.Truebuttton.setOnClickListener{
            trueAnswer()
        }
        binding.FalseButton.setOnClickListener{
            wrongAnswer()
        }
        binding.questionBox.text =q5.toString()
        binding.Truebuttton.setOnClickListener{
            trueAnswer()
        }
        binding.FalseButton.setOnClickListener{
            wrongAnswer()
        }
        binding.questionBox.text =q6.toString()
        binding.Truebuttton.setOnClickListener{
            wrongAnswer()
        }
        binding.FalseButton.setOnClickListener{
            trueAnswer()
        }
        binding.questionBox.text =q7.toString()
        binding.Truebuttton.setOnClickListener{
            trueAnswer()
        }
        binding.FalseButton.setOnClickListener{
            wrongAnswer()
        }
        binding.questionBox.text =q8.toString()
        binding.Truebuttton.setOnClickListener{
            trueAnswer()
        }
        binding.FalseButton.setOnClickListener{
            wrongAnswer()
        }
        binding.questionBox.text =q9.toString()
        binding.Truebuttton.setOnClickListener{
            wrongAnswer()
        }
        binding.FalseButton.setOnClickListener{
            trueAnswer()
        }
        binding.questionBox.text =q10.toString()
        binding.Truebuttton.setOnClickListener{
            wrongAnswer()
        }
        binding.FalseButton.setOnClickListener{
            trueAnswer()
        }


    }
    fun cheat() {
        var cheatButtonIntent = Intent(this, MainActivity2::class.java)
        startActivity(cheatButtonIntent)

    }
    fun trueAnswer(){
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
    }
    fun wrongAnswer(){
        Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
    }
}