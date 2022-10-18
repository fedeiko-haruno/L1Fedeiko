package com.example.laboratoryfedeiko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var clickBtnCount = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var b1 = findViewById<Button>(R.id.btnChangeText)
        b1.setOnClickListener {
            clickBtnCount ++;
            printSomeText();
        }

    }
     private fun printSomeText(){
         var t1 = findViewById<TextView>(R.id.someTextChange)
         t1.setText("🌺Counting button clicks to change the text🌺: $clickBtnCount")
     }
}