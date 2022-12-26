package com.example.m_care

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val sharedPref=getSharedPreferences("myPref",Context.MODE_APPEND)
        val editor=sharedPref.edit()

        submit.setOnClickListener {
            val name=etyourname.text.toString()
            val email=etemailaddress.text.toString()
            val password=etyourpassword.text.toString()
            editor.apply{
                putString("name",name)
                putString("email",email)
                putString("password",password)
                apply()
                finish()

            }

        }
    }
}