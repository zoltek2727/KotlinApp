package com.example.sebastian.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnFace.setOnClickListener {
            Toast.makeText(this, "Buźka!", Toast.LENGTH_LONG).show()
        }

        btnQuestion.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
        }

        sbText.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                tvLabel.text = "Progress : $i"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(applicationContext, "start tracking", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(applicationContext, "stop tracking", Toast.LENGTH_SHORT).show()
            }
        })
    }
}