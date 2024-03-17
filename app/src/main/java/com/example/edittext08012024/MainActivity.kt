package com.example.edittext08012024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var btnShowMessage: Button
    private lateinit var edtInputMessage: EditText
    private lateinit var txtMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Anh xa
        btnShowMessage = findViewById(R.id.button_show)
        edtInputMessage = findViewById(R.id.edit_text_message)
        txtMessage = findViewById(R.id.text_view_message)

        handleData(this::callback)
    }

//    fun doSomething(a: Int, b: Int, callBack: (String) ->  Unit) {
//        val total = a + b
//        callBack(total.toString())
//    }
//
//    fun printMessage (message: String) {
//        println(message)
//    }

        fun handleData(callback: (String) -> Unit) {
            var message = ""
            CoroutineScope(Dispatchers.IO).launch {
                delay(1000)
                message = "Success"
                callback(message)
            }
        }

        fun callback(message: String): Unit {
            Log.d("Nky", message)
        }
    }


