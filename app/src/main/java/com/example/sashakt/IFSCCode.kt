package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ifsccode.*

class IFSCCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ifsccode)
        next.setOnClickListener{
            val intent = Intent(this, SellingItem::class.java)
            startActivity(intent)
        }
    }
}
