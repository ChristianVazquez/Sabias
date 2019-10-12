package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal_.*

class Principal_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_)
        btncurioso.setOnClickListener {
            startActivity(Intent(this, Curioso_Activity::class.java))
        }
        btnciencia.setOnClickListener {
            startActivity(Intent(this, Ciencia_Activity::class.java))
        }
        btnhistoria.setOnClickListener {
            startActivity(Intent(this, Historia_Activity::class.java))
        }
        btnsalir.setOnClickListener {
            System.exit(0)
        }
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            val inflater: MenuInflater = menuInflater
            inflater.inflate(R.menu.menu_simple, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            var msg: String= ""
            when(item.itemId){
                R.id.itmInfo-> {startActivity(Intent(this, MainActivity::class.java))}
                R.id.itmAyuda-> {startActivity(Intent(this, Ayuda::class.java))}
                R.id.itmAcerca-> {startActivity(Intent(this, Acerca::class.java))}
            }
            Toast.makeText(this, msg,Toast.LENGTH_LONG).show()
            return super.onOptionsItemSelected(item)
        }



}
