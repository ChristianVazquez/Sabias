package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_informacion.*
import kotlinx.android.synthetic.main.activity_principal_.*

class Informacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
        btnayuda.setOnClickListener {
            startActivity(Intent(this, Ayuda::class.java))
        }
        btnregresainformacion.setOnClickListener {
            finish()
        }
    }
}
