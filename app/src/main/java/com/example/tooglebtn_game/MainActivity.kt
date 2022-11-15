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

        val numbers: Array<Int> = arrayOf(4, 7, 3, 9, 1, 8, 5, 2, 6)
        val numbers_odp: Array<Int> = arrayOf()
        val score = findViewById<TextView>(R.id.tV_score)
        val output = findViewById<TextView>(R.id.tV_result)


        val toggle1 = findViewById<ToggleButton>(R.id.tB1)
        val toggle2 = findViewById<ToggleButton>(R.id.tB2)
        val toggle3 = findViewById<ToggleButton>(R.id.tB3)
        val toggle4 = findViewById<ToggleButton>(R.id.tB4)
        val toggle5 = findViewById<ToggleButton>(R.id.tB5)
        val toggle6 = findViewById<ToggleButton>(R.id.tB6)
        val toggle7 = findViewById<ToggleButton>(R.id.tB7)
        val toggle8 = findViewById<ToggleButton>(R.id.tB8)
        val toggle9 = findViewById<ToggleButton>(R.id.tB9)

        findViewById<ToggleButton>(R.id.tB1).setOnClickListener{
            output.text = output.text.toString() + "1"
        }

        findViewById<ToggleButton>(R.id.tB2).setOnClickListener{
            output.text = output.text.toString() + "2"
        }

        findViewById<ToggleButton>(R.id.tB3).setOnClickListener{
            output.text = output.text.toString() + "3"
        }

        findViewById<ToggleButton>(R.id.tB4).setOnClickListener{
            output.text = output.text.toString() + "4"
        }

        findViewById<ToggleButton>(R.id.tB5).setOnClickListener{
            output.text = output.text.toString() + "5"
        }

        findViewById<ToggleButton>(R.id.tB6).setOnClickListener{
            output.text = output.text.toString() + "6"
        }

        findViewById<ToggleButton>(R.id.tB7).setOnClickListener{
            output.text = output.text.toString() + "7"
        }

        findViewById<ToggleButton>(R.id.tB8).setOnClickListener{
            output.text = output.text.toString() + "8"
        }

        findViewById<ToggleButton>(R.id.tB9).setOnClickListener{
            output.text = output.text.toString() + "9"
        }

    }
}