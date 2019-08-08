package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.roll_button)
        var resultText: TextView = findViewById(R.id.result_text)

        rollButton.setOnClickListener { rollDice() }
        resultText.text = "Dice Rolled!"
    }

    private fun rollDice(){
        var resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random.nextInt(6) + 1
        resultText.text = randomInt.toString()
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
