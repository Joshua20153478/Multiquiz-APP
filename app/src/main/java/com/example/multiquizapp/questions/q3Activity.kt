package com.example.multiquizapp.questions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.R
import com.example.multiquizapp.ScoreActivity
import com.example.multiquizapp.databinding.ActivityQ3Binding
import com.example.multiquizapp.questions.q1Activity.Companion.score

class q3Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q3)

        val intent = Intent(this, ScoreActivity::class.java)

        val binding = DataBindingUtil.setContentView<ActivityQ3Binding>(this,
            R.layout.activity_q3)



        val points = getIntent()
        val bundle = points.getExtras()
        val score = bundle?.getInt("score")

        binding.root.setOnClickListener() {
            when (binding.root) {

                binding.incisoA3 -> {
                    q1Activity.score += 1
                    intent.putExtra("score", q1Activity.score)
                    startActivity(intent)
                }
                binding.incisoB3 -> {
                    q1Activity.score += 0
                    intent.putExtra("score", q1Activity.score)
                    startActivity(intent)
                }
                binding.incisoC3 -> {
                    q1Activity.score += 0
                    intent.putExtra("score", q1Activity.score)
                    startActivity(intent)
                }
            }
        }
    }
}