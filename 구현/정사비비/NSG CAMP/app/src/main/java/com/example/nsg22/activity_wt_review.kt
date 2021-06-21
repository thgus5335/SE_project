package com.example.nsg22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wt_review.*

class activity_wt_review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wt_review)

        button4.setOnClickListener {
            val intent = Intent(this, activity_reviewlists::class.java)

            startActivity(intent)
        }
    }
}