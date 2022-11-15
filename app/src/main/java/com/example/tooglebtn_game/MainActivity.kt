package com.example.tooglebtn_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers : Array<Int> = arrayOf(4,7,3,9,1,8,5,2,6)
        val numbers_odp : Array<Int> = arrayOf()
        val output = findViewById<TextView>(R.id.tV_score)

        val toggle1 = findViewById<ToggleButton>(R.id.tB1)
        val toggle2 = findViewById<ToggleButton>(R.id.tB2)
        val toggle3 = findViewById<ToggleButton>(R.id.tB3)
        val toggle4 = findViewById<ToggleButton>(R.id.tB4)
        val toggle5 = findViewById<ToggleButton>(R.id.tB5)
        val toggle6 = findViewById<ToggleButton>(R.id.tB6)
        val toggle7 = findViewById<ToggleButton>(R.id.tB7)
        val toggle8 = findViewById<ToggleButton>(R.id.tB8)
        val toggle9 = findViewById<ToggleButton>(R.id.tB9)
    }
}