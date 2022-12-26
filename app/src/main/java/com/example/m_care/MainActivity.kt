package com.example.m_care

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val sharedPref= getSharedPreferences("myPref",Context.MODE_ENABLE_WRITE_AHEAD_LOGGING)
            val name=sharedPref.getString("name",null)
            val email=sharedPref.getString("email",null)
            val password=sharedPref.getString("password",null)
            if (email!=null && password!=null)
          if ( editPersonName.text.toString().equals(email)
            &&editPassword.text.toString().equals(password))
            Intent(this, second_activity::class.java).also {
                startActivity(it)

            }
             else
              Toast.makeText(this,"Please register yourself", Toast.LENGTH_SHORT).show()

        }
        signup.setOnClickListener {
            Intent(this, SignupActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}

