package com.example.sebastian.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        btnButton.setOnClickListener {
            tvLabelAnswer.text = "Good answer!"
        }

        btnCheck.setOnClickListener {
            tvLabelAnswer.text = "Bad answer!"
        }
    }
}