package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityTruthtableBinding

class TruthTableActivity : AppCompatActivity() {
    private lateinit var binding : ActivityTruthtableBinding
    private var goodAnswers:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTruthtableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }
    private fun initViews(){
        binding.btnSubmit.setOnClickListener(){
            checkAnswers()
        }
    }
    private fun checkAnswers(){
        if(binding.edAnswer1.text.toString() == "T"){
            goodAnswers+=1
        }
        if(binding.edAnswer2.text.toString() == "F"){
            goodAnswers+=1
        }
        if(binding.edAnswer3.text.toString() == "F"){
            goodAnswers+=1
        }
        if(binding.edAnswer4.text.toString() == "F"){
            goodAnswers+=1
        }
        Toast.makeText(this, "Answers correct: $goodAnswers", Toast.LENGTH_SHORT).show()
        goodAnswers = 0
    }
}