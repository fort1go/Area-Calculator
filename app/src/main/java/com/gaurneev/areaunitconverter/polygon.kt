package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class polygon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polygon)

        val side : TextView = findViewById(R.id.etName1)
        val perimeter : TextView = findViewById(R.id.etName2)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val p1:Double

        calculate.setOnClickListener {
            try {
                val side = side.text.toString().toDouble()
                val perimeter = perimeter.text.toString().toDouble()

                val answer = ("%.3f".format((side*perimeter*0.5))).toString()
                result.text = answer.toString()
            }
            catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}