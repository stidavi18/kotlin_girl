package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var tvr: TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val boton=findViewById<Button>(R.id.boton1)
        boton.setOnClickListener{
            val intent = Intent(this, MainContenido::class.java);
            startActivity(intent);

        }










    }
}