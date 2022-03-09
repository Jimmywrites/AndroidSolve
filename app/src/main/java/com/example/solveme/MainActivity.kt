package com.example.solveme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solveme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.solve.setOnClickListener {
            val show= Intent(this,QuizLayout2::class.java)
            startActivity(show)
        }
    }
}