package com.example.multiquizapp.questions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.R
import com.example.multiquizapp.databinding.ActivityQ2Binding

class q2Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)

        val intent = Intent(this, q3Activity::class.java)
        val binding = DataBindingUtil.setContentView<ActivityQ2Binding>(this,
            R.layout.activity_q2)

        val points = getIntent()
        val bundle = points.getExtras()
        val score = bundle?.getInt("score")

        binding.root.setOnClickListener() {
            when (binding.root) {

                binding.incisoA2 -> {
                   q1Activity.score += 1
                    intent.putExtra("score", q1Activity.score)
                    startActivity(intent)
                }
                binding.incisoB2 -> {
                    q1Activity.score += 0
                    intent.putExtra("score", q1Activity.score)
                    startActivity(intent)
                }
                binding.incisoC2 -> {
                    q1Activity.score += 0
                    intent.putExtra("score", q1Activity.score)
                    startActivity(intent)
                }
            }
        }
    }
}