package com.example.grados

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val boton: Button = findViewById(R.id.button)
        val boton2: Button = findViewById(R.id.button2)
        val boton3: Button = findViewById(R.id.button3)

        val campoTextoEditable: EditText = findViewById(R.id.editTextNumber)

        val CajaC: TextView = findViewById(R.id.textView6)
        val CajaF: TextView = findViewById(R.id.textView8)
        val CajaK: TextView = findViewById(R.id.textView10)

        boton.setOnClickListener {
            val numeroIngresado = campoTextoEditable.text.toString() // Obtiene el texto del campo de texto
            CajaC.text = numeroIngresado // Muestra el texto en el TextView
            val celsius = campoTextoEditable.text.toString().toDouble()
            val fahrenheit = (celsius * 9/5) + 32
            val kelvin = celsius + 273.15
            CajaF.text = fahrenheit.toString()
            CajaK.text = kelvin.toString()

        }
        boton2.setOnClickListener {
            val numeroIngresado = campoTextoEditable.text.toString() // Obtiene el texto del campo de texto
            CajaF.text = numeroIngresado // Muestra el texto en el TextView
            val fahrenheit = campoTextoEditable.text.toString().toDouble()
            val celsius = (fahrenheit - 32) * 5/9
            CajaC.text = celsius.toString()
            val kelvin = (fahrenheit - 32) * 5/9 + 273.15
            CajaK.text = kelvin.toString()



        }
        boton3.setOnClickListener {
            val numeroIngresado = campoTextoEditable.text.toString() // Obtiene el texto del campo de texto
            CajaK.text = numeroIngresado // Muestra el texto en el TextView
            val kelvin = campoTextoEditable.text.toString().toDouble()
            val celsius = kelvin - 273.15
            CajaC.text = celsius.toString()
            val fahrenheit = (kelvin * 9/5) - 459.67
            CajaF.text = fahrenheit.toString()

        }



    }
}