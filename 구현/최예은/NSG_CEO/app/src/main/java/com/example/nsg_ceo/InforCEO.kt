package com.example.nsg_ceo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_infor_ceo.*

class InforCEO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infor_ceo)

        inforChange.setOnClickListener {
            Toast.makeText(this, "회원정보를 수정했습니다.", Toast.LENGTH_SHORT).show()
        }
        delete.setOnClickListener {
            Toast.makeText(this, "탈퇴를 완료하였습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}