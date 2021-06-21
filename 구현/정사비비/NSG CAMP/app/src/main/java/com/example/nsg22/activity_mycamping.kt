package com.example.nsg22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mycamping.*

class activity_mycamping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mycamping)

        button2.setOnClickListener {
            Toast.makeText(this, "수정 되었습니다.", Toast.LENGTH_SHORT).show();
            val intent = Intent(this, 운영자 마이페이지::class.java)

            startActivity(intent)
        }

    }

}