package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import java.util.*
import kotlin.math.sqrt

class trapezoid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapezoid)

        val side1 : TextView = findViewById(R.id.etName1)
        val side2 : TextView = findViewById(R.id.etName2)
        val side3 : TextView = findViewById(R.id.etName3)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val a:Double
        val b:Double
        val c:Double

        calculate.setOnClickListener {
            try {
                val a = side1.text.toString().toDouble()
                val b = side2.text.toString().toDouble()
                val c = side3.text.toString().toDouble()

                val s = (a + b) * c / 2
                val answer = ("%.3f".format(s)).toString()
                result.text = answer.toString()
            }
              catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}