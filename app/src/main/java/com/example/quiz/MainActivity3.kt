package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val a = intent
        var q = a.getStringExtra(extra)

        textView.setText(q.toString())

        button.setOnClickListener {
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
        }
    }
}