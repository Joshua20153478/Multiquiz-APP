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
        var score = bundle?.getInt("score")
        var nameUser = bundle?.getString("name")

                binding.incisoA2.setOnClickListener() {
                    score = score?.plus(1)
                    intent.putExtra("score", score)
                    intent.putExtra("name", nameUser)
                    startActivity(intent)
                }
                binding.incisoB2.setOnClickListener() {
                    score = score?.plus(0)
                    intent.putExtra("score", score)
                    intent.putExtra("name", nameUser)
                    startActivity(intent)
                }
                binding.incisoC2.setOnClickListener() {
                    score = score?.plus(0)
                    intent.putExtra("score", score)
                    intent.putExtra("name", nameUser)
                    startActivity(intent)
                }
    }
}