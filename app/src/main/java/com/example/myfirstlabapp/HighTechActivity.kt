package com.example.myfirstlabapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class HighTechActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_tech)

        supportActionBar?.hide()
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }, 2000)
    }
}