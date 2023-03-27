package com.example.myfirstlabapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        supportActionBar?.hide()
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, HighTechActivity::class.java))
            finish()
        }, 2000)

    }
}