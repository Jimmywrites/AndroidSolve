package com.example.solveme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.inflate
import com.example.solveme.databinding.ActivityMainBinding
import com.example.solveme.databinding.ActivityMainBinding.inflate
import com.example.solveme.databinding.ActivityQuizLayoutBinding
import com.example.solveme.databinding.ActivityQuizLayoutBinding.inflate

class QuizLayout : AppCompatActivity() {
    //viewBinding:create a late initialized variable
    private lateinit var binding:ActivityQuizLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //call the late initialized binding variable and inflate the layout
        var binding:ActivityQuizLayoutBinding=ActivityQuizLayoutBinding.inflate(layoutInflater)
        //set the content view
        setContentView(binding.root)

        binding.goHome.setOnClickListener{
            val show=Intent(this,MainActivity::class.java)
            startActivity(show)

        }


    }
}