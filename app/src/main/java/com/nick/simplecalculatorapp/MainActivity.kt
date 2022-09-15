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
                btnClicked("1")
            }

            R.id.button_two -> {
                btnClicked("2")
            }

            R.id.button_three -> {
                btnClicked("3")
            }

            R.id.button_four -> {
                btnClicked("4")
            }

            R.id.button_five -> {
                btnClicked("5")
            }

            R.id.button_six -> {
                btnClicked("6")
            }

            R.id.button_seven -> {
                btnClicked("7")
            }

            R.id.button_eight -> {
                btnClicked("8")
            }

            R.id.button_nine -> {
                btnClicked("9")
            }

            R.id.button_zero -> {
                btnClicked("0")
            }

            R.id.button_dot -> {
                btnClicked(".")
            }

            R.id.button_clear -> {
                clearEditText()
            }

            R.id.button_add -> {
                addClicked()
            }

            R.id.button_subtract -> {
                subtractClicked()
            }

            R.id.button_divide -> {
                divideClicked()
            }

            R.id.button_equality -> {
                equalityClicked()
            }
        }

    }

    private fun btnClicked(btnText: String) {
        val number = editText.text.toString() + btnText
        editText.setText(number)
    }

    private fun clearEditText() {
        editText.setText("")
    }

    private fun addClicked() {
        number1 = editText.text.toString().toFloat()
        clearEditText()
        isAdd = true
    }

    private fun subtractClicked() {
        number1 = editText.text.toString().toFloat()
        clearEditText()
        isSubtract = true
    }

    private fun divideClicked() {
        number1 = editText.text.toString().toFloat()
        clearEditText()
        isDivide = true
    }

    private fun equalityClicked() {
        val number2 = editText.text.toString().toFloat()
        var result = 0.0f

        when {
            isAdd -> {
                result = number1 + number2
                isAdd = false
            }
            isSubtract -> {
                result = number1 - number2
                isSubtract = false
            }
            isDivide -> {
                result = number1 / number2
                isDivide = false
            }
        }

        editText.setText(result.toString())
    }

}