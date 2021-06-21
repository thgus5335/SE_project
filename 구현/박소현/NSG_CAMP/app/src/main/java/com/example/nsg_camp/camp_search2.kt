package com.example.nsg_camp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activitiy_camp_search2.*

class camp_search2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitiy_camp_search2)

        camp1.setOnClickListener {
            val intent1 = Intent(this, camp_search3::class.java)
            startActivity(intent1)
        }

    }

}