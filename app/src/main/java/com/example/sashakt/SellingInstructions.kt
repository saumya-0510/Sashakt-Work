package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_selling_instructions.*

class SellingInstructions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selling_instructions)

        next.setOnClickListener{
            val intent = Intent(this, BranchAndBank::class.java)
            startActivity(intent)
        }
    }
}