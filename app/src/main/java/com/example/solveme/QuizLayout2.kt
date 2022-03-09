package com.example.solveme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solveme.databinding.ActivityQuizLayout2Binding

class QuizLayout2 : AppCompatActivity() {

        private lateinit var binding:ActivityQuizLayout2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityQuizLayout2Binding = ActivityQuizLayout2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener{




        }


    }
}