package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class cube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)

        val side : TextView = findViewById(R.id.etName1)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val s1:Double

        calculate.setOnClickListener {
            try {
                val s1 = side.text.toString().toDouble()

                val answer = (s1*s1*s1).toString()
                result.text = answer.toString()
            }
            catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}