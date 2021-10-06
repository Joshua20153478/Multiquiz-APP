package com.example.multiquizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.databinding.ActivityScoreBinding

class ScoreActivity:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val binding = DataBindingUtil.setContentView<ActivityScoreBinding>(this,
            R.layout.activity_score)

        val points = getIntent()
        val bundle = points.getExtras()
        var score = bundle?.getInt("score")
        var nameUser = bundle?.getString("name")

        binding.tryAgain.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.root
    }
}