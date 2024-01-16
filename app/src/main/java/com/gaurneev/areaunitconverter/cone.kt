package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class cone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cone)

        val sideR1 : TextView = findViewById(R.id.etName1)
        val sideR2 : TextView = findViewById(R.id.etName2)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val len:Double
        val bre:Double

        calculate.setOnClickListener {
            try {
                val radius = sideR1.text.toString().toDouble()
                val height = sideR2.text.toString().toDouble()

                val answer = "%.3f".format((height*radius*radius*3.14/3)).toString()
                result.text = answer.toString()
            }
            catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}