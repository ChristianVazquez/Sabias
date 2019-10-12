package com.example.sabias_que

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ciencia.*

class Ciencia_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciencia)
        btnregresaayuda.setOnClickListener {
            finish()
        }
    }
}
