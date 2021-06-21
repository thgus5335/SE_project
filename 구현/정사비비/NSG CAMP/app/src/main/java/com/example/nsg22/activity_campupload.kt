package com.example.nsg22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_campupload.*

import android.view.View;
import android.widget.Toast;

class activity_campupload : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campupload)

        button1.setOnClickListener(){
            Toast.makeText(this, "등록 되었습니다.", Toast.LENGTH_SHORT).show();
        }
    }
}