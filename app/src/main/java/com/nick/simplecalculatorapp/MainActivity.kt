package com.nick.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.number_edit_text)

    }

    fun operationFunction(view: View) {

        when(view.id) {
            R.id.button_one -> {
                val number = editText.text.toString() + "1"
                editText.setText(number)
            }
            R.id.button_two -> {
                val number = editText.text.toString() + "2"
                editText.setText(number)
            }
            R.id.button_three -> {
                val number = editText.text.toString() + "3"
                editText.setText(number)
            }
            R.id.button_four -> {
                val number = editText.text.toString() + "4"
                editText.setText(number)
            }
            R.id.button_five -> {
                val number = editText.text.toString() + "5"
                editText.setText(number)
            }
            R.id.button_six -> {
                val number = editText.text.toString() + "6"
                editText.setText(number)
            }
            R.id.button_seven -> {
                val number = editText.text.toString() + "7"
                editText.setText(number)
            }
            R.id.button_eight -> {
                val number = editText.text.toString() + "8"
                editText.setText(number)
            }
            R.id.button_nine -> {
                val number = editText.text.toString() + "9"
                editText.setText(number)
            }
            R.id.button_zero -> {
                val number = editText.text.toString() + "0"
                editText.setText(number)
            }
            R.id.button_dot -> {
                val number = editText.text.toString() + "."
                editText.setText(number)
            }
            R.id.button_clear -> {
                editText.setText("")
            }
        }

    }
}