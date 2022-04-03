@file:Suppress("DEPRECATION")

package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivityLaunch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_launch)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@MainActivityLaunch, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)

    }
}