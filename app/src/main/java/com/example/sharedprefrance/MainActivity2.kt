package com.example.sharedprefrance

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button3: Button
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView = findViewById(R.id.textView)
        button3 = findViewById(R.id.button3)
        sharedPreferences = getSharedPreferences("information", MODE_PRIVATE)

        val input = intent.getStringExtra("info1")
        val input2 = intent.getStringExtra("info2")
        textView.text = input + "\n" + input2

        button3.setOnClickListener {
            val shared1 = sharedPreferences.getString("info1", "no data with this key")
            val shared2 = sharedPreferences.getString("info2", "no data with this key")
            textView.text = shared1 + "\n" + shared2
        }
    }
}