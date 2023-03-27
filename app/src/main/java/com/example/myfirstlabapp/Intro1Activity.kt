package com.example.myfirstlabapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Intro1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro1)

        supportActionBar?.hide()
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }, 2000)

    }
}