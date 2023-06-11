package com.example.kidscardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

        var btn_click_me = findViewById(R.id.button2) as Button
        var input_area = findViewById(R.id.editTextText2) as EditText


        btn_click_me.setOnClickListener {
            val inputValue = input_area.text.toString()
            if (inputValue.equals("37")) {
                Toast.makeText(this, "Cevap doğru!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cevap yanlış!", Toast.LENGTH_SHORT).show()
            }
        }



    }
}