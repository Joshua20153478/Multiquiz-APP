package com.example.multiquizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.databinding.ActivityMainBinding

class ScoreActivity:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val intent = Intent(this, MainActivity::class.java)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_score)
    }
}