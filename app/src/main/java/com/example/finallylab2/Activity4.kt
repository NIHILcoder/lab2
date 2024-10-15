package com.example.finallylab2

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

// Отображаем xml
class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity4)

        val customButton: MaterialButton = findViewById(R.id.custom_button)

        // меняем цвет
        customButton.setOnClickListener {
            customButton.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#90EE90"))
        }

    }
}