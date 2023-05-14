package com.example.kotlin

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainContenido : AppCompatActivity() {

    private var bn: Button?=null
    private var bs: Button?=null
    private var tvr:TextView?=null
    val displayMetrics=DisplayMetrics()
    var alto=0
    var ancho=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_contenido)

        bn=findViewById(R.id.btnno)
        bs=findViewById(R.id.btnsi)
        tvr=findViewById(R.id.txtViewRespuesta)
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        alto=displayMetrics.heightPixels
        ancho=displayMetrics.widthPixels


    }

    fun clickNo(view: View){
        var randomx=(250..ancho-250).random().toFloat()
        var randomy=(100..alto-100).random().toFloat()
        bn?.x=randomx
        bn?.y=randomy


    }

    fun clickSi(view:View){
        val mediaPlayer = MediaPlayer.create(this, R.raw.sonido)
        tvr?.text="Sabia que tenias buen gusto, a continuacion musica para armonizar el momento, nos vemos pronto baby"
        mediaPlayer.start()
    }

}