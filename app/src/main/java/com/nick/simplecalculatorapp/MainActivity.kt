package com.nick.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private var number1: Float = 0.0f
    private var isAdd: Boolean = false
    private var isSubtract: Boolean = false
    private var isDivide: Boolean = false

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

            R.id.button_add -> {
                number1 = editText.text.toString().toFloat()
                editText.setText("")
                isAdd = true
            }

            R.id.button_subtract -> {
                number1 = editText.text.toString().toFloat()
                editText.setText("")
                isSubtract = true
            }

            R.id.button_divide -> {
                number1 = editText.text.toString().toFloat()
                editText.setText("")
                isDivide = true
            }

            R.id.button_equality -> {
                val number2 = editText.text.toString().toFloat()
                var result = 0.0f

                if (isAdd) {
                    result = number1 + number2
                    isAdd = false
                } else if (isSubtract) {
                    result = number1 - number2
                    isSubtract = false
                } else if (isDivide) {
                    result = number1 / number2
                    isDivide = false
                }


                editText.setText(result.toString())
            }
        }

    }
}