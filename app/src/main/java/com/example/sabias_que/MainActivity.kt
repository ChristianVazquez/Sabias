package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  val SPLASH_TIME_OUT: Long=4000 // 4 segundos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // se crea objeto de la clase animation
        val animacion: Animation = AnimationUtils.loadAnimation(this, R.anim.animacion)
        txtUno.startAnimation(animacion)

        Handler().postDelayed({
            startActivity(Intent(this, Principal_Activity::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }
}