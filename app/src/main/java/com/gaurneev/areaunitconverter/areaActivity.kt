package com.gaurneev.areaunitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class areaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)

        var tri = findViewById<Button>(R.id.triangle)
        var rec = findViewById<Button>(R.id.rectangles)
        var squ = findViewById<Button>(R.id.square)
        var pol = findViewById<Button>(R.id.polygon)
        var cir = findViewById<Button>(R.id.circle)
        var pal = findViewById<Button>(R.id.parallelogram)
        var ell = findViewById<Button>(R.id.ellipse)
        var tra = findViewById<Button>(R.id.trapezoid)
        var cirp = findViewById<Button>(R.id.cirpart)
        var cub = findViewById<Button>(R.id.cube)
        var par = findViewById<Button>(R.id.parallelepiped)


        tri.setOnClickListener{
            startActivity(Intent(this,triangle::class.java))
        }
        rec.setOnClickListener{
            startActivity(Intent(this,rectangle::class.java))
        }
        squ.setOnClickListener{
            startActivity(Intent(this,square::class.java))
        }
        pol.setOnClickListener{
            startActivity(Intent(this,polygon::class.java))
        }
        cir.setOnClickListener{
            startActivity(Intent(this,circle::class.java))
        }
        pal.setOnClickListener{
            startActivity(Intent(this,parallelogram::class.java))
        }
        ell.setOnClickListener{
            startActivity(Intent(this,ellipse::class.java))
        }
        tra.setOnClickListener{
            startActivity(Intent(this,trapezoid::class.java))
        }
        cirp.setOnClickListener{
            startActivity(Intent(this,cirpart::class.java))
        }
        cub.setOnClickListener{
            startActivity(Intent(this,cube::class.java))
        }
        par.setOnClickListener{
            startActivity(Intent(this,parallelepiped::class.java))
        }
    }
}