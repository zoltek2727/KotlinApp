package com.example.sebastian.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun reverseText(a:String):String {
        return a.reversed();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirm.setOnClickListener {
            Toast.makeText(this, etText.text, Toast.LENGTH_SHORT).show()
        }

        btnReverse.setOnClickListener {
            Toast.makeText(this,reverseText(etText.text.toString()), Toast.LENGTH_LONG).show();
        }
    }
}
