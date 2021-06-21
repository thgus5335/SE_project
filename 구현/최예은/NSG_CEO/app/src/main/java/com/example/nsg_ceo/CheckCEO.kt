package com.example.nsg_ceo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_ceo.*
import kotlinx.android.synthetic.main.activity_infor_ceo.*

class CheckCEO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_ceo)

        checkinf1.setOnClickListener {
            Toast.makeText(this, "예약정보를 조회합니다.", Toast.LENGTH_SHORT).show()
        }
        checkinf2.setOnClickListener {
            Toast.makeText(this, "예약정보를 조회합니다.", Toast.LENGTH_SHORT).show()
        }
        checkinf3.setOnClickListener {
            Toast.makeText(this, "예약정보를 조회합니다.", Toast.LENGTH_SHORT).show()
        }
        checkinf4.setOnClickListener {
            Toast.makeText(this, "예약정보를 조회합니다.", Toast.LENGTH_SHORT).show()
        }


        monOk1.setOnClickListener {
            Toast.makeText(this, "예약을 승인합니다.", Toast.LENGTH_SHORT).show()
        }
        monOk2.setOnClickListener {
            Toast.makeText(this, "예약을 승인합니다.", Toast.LENGTH_SHORT).show()
        }
        monOk3.setOnClickListener {
            Toast.makeText(this, "이미 승인됐습니다.", Toast.LENGTH_SHORT).show()
        }
        monOk4.setOnClickListener {
            Toast.makeText(this, "이미 승인됐습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}