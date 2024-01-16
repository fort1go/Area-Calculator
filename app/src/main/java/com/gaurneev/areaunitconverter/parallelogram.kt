package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class parallelogram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parallelogram)

        val side1 : TextView = findViewById(R.id.etName1)
        val side2 : TextView = findViewById(R.id.etName2)
        val sinangle : TextView = findViewById(R.id.etName3)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val s1:Double

        calculate.setOnClickListener {
            try {
                val s1 = side1.text.toString().toDouble()
                val s2 = side2.text.toString().toDouble()
                val sa = sinangle.text.toString().toDouble()

                val answer = ("%.3f".format((s1*s2*sa))).toString()
                result.text = answer.toString()
            }
            catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}