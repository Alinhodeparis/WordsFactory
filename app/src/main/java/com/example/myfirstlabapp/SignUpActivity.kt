package com.example.myfirstlabapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, WordsFactoryActivity::class.java))
            finish()
        }, 2000)
    }
}