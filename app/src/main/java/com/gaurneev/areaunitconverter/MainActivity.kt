package com.gaurneev.areaunitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnArea=findViewById<FrameLayout>(R.id.btnArea)

        btnArea.setOnClickListener{
            startActivity(Intent(this, areaActivity::class.java))
        }

    }
}