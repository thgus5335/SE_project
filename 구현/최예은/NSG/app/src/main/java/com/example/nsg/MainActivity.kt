package com.example.nsg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_main)

        logout.setOnClickListener {
            Toast.makeText(this, "로그아웃 했습니다.",Toast.LENGTH_SHORT).show()
        }

        button1.setOnClickListener{
            val intent = Intent(this, InforCus::class.java)
            startActivity(intent)
            }

        button2.setOnClickListener {
            val intent = Intent (this, CheckCus::class.java)
            startActivity(intent)
        }
    }
}