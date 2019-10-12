package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayuda.*


class Ayuda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)
        btna.setOnClickListener {
            startActivity(Intent(this, Informacion::class.java))
        }
        btnregresaayuda.setOnClickListener {
            finish()
        }
    }
}
