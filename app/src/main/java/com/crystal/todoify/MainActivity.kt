package com.crystal.todoify

import android.os.Bundle;
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    private val todoItems = listOf("Buy milk", "Walk the dog", "Read Kotlin book")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container = findViewById<LinearLayout>(R.id.cardContainer)

        for (item in todoItems) {
            val cardView = layoutInflater.inflate(R.layout.todo_card, container, false) as CardView
            val textView = cardView.findViewById<TextView>(R.id.todo_text)
            textView.text = item
            container.addView(cardView)
        }
    }
}