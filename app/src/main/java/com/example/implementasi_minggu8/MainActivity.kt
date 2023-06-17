package com.example.implementasi_minggu8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText
        val editText = findViewById<EditText>(R.id.editText)

        // CheckBox
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val checkButton = findViewById<Button>(R.id.checkButton)
        checkButton.setOnClickListener {
            val isChecked = checkBox.isChecked
            val resultText = if (isChecked) "checked" else "unchecked"
            Toast.makeText(this, "Checkbox is $resultText", Toast.LENGTH_SHORT).show()
        }

        // RadioButtons
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val radioButton4 = findViewById<RadioButton>(R.id.radioButton4)
        val radioButton5 = findViewById<RadioButton>(R.id.radioButton5)
        val radioButtonsButton = findViewById<Button>(R.id.radioButtonsButton)
        radioButtonsButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)
            val selectedText = selectedRadioButton.text.toString()
            Toast.makeText(this, "Selected radio button: $selectedText", Toast.LENGTH_SHORT).show()
        }

        // Spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        val spinnerButton = findViewById<Button>(R.id.spinnerButton)
        val spinnerValues = arrayOf("Hot Sauce", "Glitch Mode", "Hello Future", "Candy", "Beatbox")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        spinner.adapter = spinnerAdapter
        spinnerButton.setOnClickListener {
            val selectedValue = spinner.selectedItem.toString()
            Toast.makeText(this, "Selected spinner value: $selectedValue", Toast.LENGTH_SHORT).show()
        }
    }
}