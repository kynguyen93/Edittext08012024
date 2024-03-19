package com.example.edittext08012024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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

//        handleData(fun(String1) {
//            Log.d("Nky", "Function ${this}" )
//        }, "1")

//        handleData({string1 ->
//            Log.d("Nky", "Function ${this}" )
//        }, "1")

//        btnShowMessage.setOnClickListener(object : OnClickListener {
//            override fun onClick(p0: View?) {
//
//            }
//        })

        btnShowMessage.setOnClickListener {
            // kiem tra gia tri trong logcat
           //Log.d("Nky", "Button mesage click")

            // hien thi thong bao len man hinh
            //Toast.makeText(this@MainActivity, "Click button", Toast.LENGTH_LONG).show()

            // lay du lieu input
            val inputMessage = edtInputMessage.toString()
            Toast.makeText(this@MainActivity, inputMessage,Toast.LENGTH_LONG).show()
        }
    }
        fun handleData(callback: (String) -> Unit, text: String) {
            CoroutineScope(Dispatchers.IO).launch {
                delay(1000)
                var message = "Success"
                callback(message)
            }
        }

        fun callback(message: String): Unit {
            Log.d("Nky", message)
        }
    }



