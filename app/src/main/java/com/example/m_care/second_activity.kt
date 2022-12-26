package com.example.m_care

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)
        val sharedPref= getSharedPreferences("myPref", Context.MODE_ENABLE_WRITE_AHEAD_LOGGING)
        val name=sharedPref.getString("name",null)
        textView.setText("Hii "+name)
        questionare.setOnClickListener {
            Intent(this,Choice_activity::class.java).also {
                startActivity(it)
            }
        }
    }
}