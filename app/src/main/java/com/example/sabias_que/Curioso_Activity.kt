package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_curioso.*
import kotlinx.android.synthetic.main.activity_principal_.*

class Curioso_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curioso)
        btnregresacurioso.setOnClickListener {
            finish()
        }
    }
}
