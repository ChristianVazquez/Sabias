package com.example.sabias_que

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_historia.*

class Historia_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia)

        btnrevisar.setOnClickListener(){
            var respuesta: String = ""
            if(rbt2.isChecked){
                respuesta= "Correcto, de hecho no hubo víctimas."

            }else if (rbt1.isChecked){
                respuesta = "Incorrecto, por suerte no hubo víctimas"

            }
            txtResultado.text = "Tu resultado fue: ${respuesta.toString()} "
        }
        btnregresahistoria.setOnClickListener {
            finish()
        }

    }
}