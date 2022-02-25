package com.example.hw7_q2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw7_q2.databinding.ActivityMain2Binding
import com.example.hw7_q2.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        QestionList.questionList


    }
    fun previous(){
        var i = 0
        if (i>0){
            binding.questionBox.text  = QestionList.questionList[i-1].toString()
        }
        if (i<1){
            binding.prevButton.isEnabled = false

        }
    }
    fun next(){
        var i = 0
        if (i<9){
            binding.questionBox.text  = QestionList.questionList[i+1].toString()
        }
        if(i>8){
            binding.nextButton.isEnabled = false
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