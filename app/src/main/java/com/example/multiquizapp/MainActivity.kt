package com.example.multiquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.multiquizapp.databinding.ActivityMainBinding
import com.example.multiquizapp.questions.q1Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main)


        binding.button.setOnClickListener(){
            if (binding.editTextTextPersonName.text.isEmpty()){
                val alert = "Ingrese los valores solicitados"
                Toast.makeText(this, alert, Toast.LENGTH_LONG)
                    .show()
            }
            else{
                val intent = Intent(this, q1Activity::class.java).apply {
                    putExtra("name", binding.editTextTextPersonName.text)
                }
                startActivity(intent)
            }
        }
    }
}