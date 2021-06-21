package com.example.nsg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_cus.*
import kotlinx.android.synthetic.main.activity_main.*

class CheckCus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_cus)

        checkNo.setOnClickListener {
            Toast.makeText(this, "예약을 취소합니다.", Toast.LENGTH_SHORT).show()
        }
        checkChange.setOnClickListener {
            Toast.makeText(this, "예약을 수정합니다.",Toast.LENGTH_SHORT).show()
        }
    }
}