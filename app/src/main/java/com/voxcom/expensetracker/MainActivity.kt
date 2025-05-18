package com.voxcom.expensetracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var input_amount : EditText
    lateinit var addButton : TextView
    lateinit var submitButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        addButton = findViewById(R.id.addButton)
        addButton.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.addpopup, null)
            input_amount = dialogView.findViewById(R.id.input_value)
            submitButton = dialogView.findViewById(R.id.addThis)

            val dialog = AlertDialog.Builder(this)
                .setView(dialogView)
                .create()

            submitButton.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }
    }
}