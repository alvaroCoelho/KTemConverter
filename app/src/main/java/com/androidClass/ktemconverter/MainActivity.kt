package com.androidClass.ktemconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var editTextTemperatura: EditText
    lateinit var celciusRadio: RadioButton
    lateinit var fahreinheirtRadio: RadioButton
    lateinit var buttonConverter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextTemperatura = findViewById(R.id.editTextTemperatura)
        celciusRadio = findViewById(R.id.radioButtonCelsius)
        fahreinheirtRadio = findViewById(R.id.radioButtonFahreinheit)
        buttonConverter = findViewById(R.id.buttonConverter)

        buttonConverter.setOnClickListener {converter(it)}

    }

    fun converter(view: View){
        var temp: Double = editTextTemperatura.text.toString().toDouble()

        if (celciusRadio.isChecked){
            temp = (temp - 32) * 5/9
        }else if (fahreinheirtRadio.isChecked){
            temp = temp * 9/5 + 32
        }

        editTextTemperatura.setText(temp.toString())

    }
}