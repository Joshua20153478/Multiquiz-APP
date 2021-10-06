package com.example.multiquizapp.questions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.R
import com.example.multiquizapp.ScoreActivity
import com.example.multiquizapp.databinding.ActivityMainBinding

class q3Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q3)

        val intent = Intent(this, ScoreActivity::class.java)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_q3)

    }
}