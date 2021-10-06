package com.example.multiquizapp.questions

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.R
import com.example.multiquizapp.databinding.ActivityMainBinding
import com.example.multiquizapp.databinding.ActivityQ1Binding
import com.example.multiquizapp.questions.q1Activity.Companion.score

class q1Activity: AppCompatActivity() {

    companion object{
        var score =0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1)

        val intent = Intent(this, q2Activity::class.java).apply {
            putExtra("score", score)
        }

        val binding = DataBindingUtil.setContentView<ActivityQ1Binding>(this,
            R.layout.activity_q1)

        binding.root.setOnClickListener(){
            when (binding.root){

                binding.incisoA -> {
                    score += 1
                    startActivity(intent)
                }
                binding.incisoB ->{
                    score = 0
                    startActivity(intent)
                }
                binding.incisoC -> {
                    score = 0
                    startActivity(intent)
                }

            }
        }

    }
}