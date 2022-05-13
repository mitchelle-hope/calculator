package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber:EditText
    lateinit var etSecond:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubstract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber=findViewById(R.id.etNumber)
        etSecond=findViewById(R.id.etSecond)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubstract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var num1=etNumber.text.toString().toDouble()
            var num2=etSecond.text.toString().toDouble()
            add(num1,num2)
        }
        btnSubstract.setOnClickListener {
            var num1=etNumber.text.toString().toDouble()
            var num2=etSecond.text.toString().toDouble()
            subtract(num1,num2)
        }
        btnMultiply.setOnClickListener {
            var num1=etNumber.text.toString().toDouble()
            var num2=etSecond.text.toString().toDouble()
            multiply(num1,num2)
        }

        btnModulus.setOnClickListener {
            var num1=etNumber.text.toString().toDouble()
            var num2=etSecond.text.toString().toDouble()
            modulus(num1,num2)
        }


    }

    fun add(num1:Double,num2: Double){
        var total=num1+num2
        tvResult.text=total.toString()
    }
    fun subtract(num1:Double,num2: Double){
        var total=num1+num2
        tvResult.text=total.toString()
    }
    fun multiply(num1:Double,num2: Double){
        var total=num1+num2
        tvResult.text=total.toString()
    }
    fun modulus(num1:Double,num2: Double){
        var total=num1+num2
        tvResult.text=total.toString()
    }



    }

