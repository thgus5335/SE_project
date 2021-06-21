package com.example.nsg22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_review.*

import android.view.View;
import android.widget.Toast;

class activity_review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        button3.setOnClickListener(){
            Toast.makeText(this, "삭제 되었습니다.", Toast.LENGTH_SHORT).show();
        }

    }
}