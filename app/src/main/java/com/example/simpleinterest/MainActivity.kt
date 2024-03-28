package com.example.simpleinterest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPrincipal = findViewById<EditText>(R.id.TextPrincipal)
        val editTextRate = findViewById<EditText>(R.id.TextRate)
        val editTextTime = findViewById<EditText>(R.id.TextTime)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            val principal = editTextPrincipal.text.toString().toDoubleOrNull() ?: 0.0
            val rate = editTextRate.text.toString().toDoubleOrNull() ?: 0.0
            val time = editTextTime.text.toString().toDoubleOrNull() ?: 0.0

            val interest = (principal * rate * time) / 100
            textViewResult.text = "Simple Interest: $interest"
        }

        buttonClear.setOnClickListener {
            textViewResult.text = ""
            editTextPrincipal.text.clear()
            editTextRate.text.clear()
            editTextTime.text.clear()
        }
    }
}