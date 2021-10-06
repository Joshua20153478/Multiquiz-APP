package com.example.multiquizapp.questions

import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        var name = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1)

        val intent = Intent(this, q2Activity::class.java)

        val binding = DataBindingUtil.setContentView<ActivityQ1Binding>(this,
            R.layout.activity_q1)

        val name = getIntent()
        val bundle = name.getExtras()
        var nameUser = bundle?.getString("name")

                binding.incisoA.setOnClickListener(){
                    score += 1
                    intent.putExtra("score", score)
                    intent.putExtra("name", nameUser)
                    startActivity(intent)

                }
                binding.incisoB.setOnClickListener(){
                    score = 0
                    intent.putExtra("score", score)
                    intent.putExtra("name", nameUser)
                    startActivity(intent)
                }
                binding.incisoC.setOnClickListener()  {
                    score = 0
                    intent.putExtra("score", score)
                    intent.putExtra("name", nameUser)
                    startActivity(intent)
                }

    }
}