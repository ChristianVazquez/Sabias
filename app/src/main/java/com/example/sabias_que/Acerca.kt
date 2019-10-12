package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acerca.*

class Acerca : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca)

        btni.setOnClickListener {
            startActivity(Intent(this, Informacion::class.java))
        }

        btnregresaayuda.setOnClickListener {
            finish()
        }
    }
}
