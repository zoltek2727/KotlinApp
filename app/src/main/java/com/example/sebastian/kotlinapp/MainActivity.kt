package com.example.sebastian.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnClose.setOnClickListener {
            val ext = AlertDialog.Builder(this@MainActivity)

            ext.setTitle("Exit dialog")

            ext.setMessage("Are you want to quit?")

            ext.setPositiveButton("Yes") {dialog, which ->
                System.exit(0)
            }

            ext.setNegativeButton("No") {dialog, which ->
                Toast.makeText(applicationContext,"You cancelled the dialog.", Toast.LENGTH_SHORT).show()
            }

            val dialog: AlertDialog = ext.create()

            dialog.show()
        }
    }
}
