package com.example.nsg_camp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.applikeysolutions.cosmocalendar.selection.OnDaySelectedListener
import com.applikeysolutions.cosmocalendar.selection.RangeSelectionManager
import kotlinx.android.synthetic.main.activity_camp_search.*


class camp_search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camp_search)

        var location1 = resources.getStringArray(R.array.location)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location1)
        spinner.adapter = adapter

        calendar_view.isShowDaysOfWeekTitle = false
        calendar_view.selectionManager = RangeSelectionManager(OnDaySelectedListener {
            Log.e(" CALENDAR ", "========== setSelectionManager ==========")
            Log.e(" CALENDAR ", "Selected Dates : " + calendar_view.selectedDates.size)
            if (calendar_view.selectedDates.size <= 0) return@OnDaySelectedListener
            Log.e(" CALENDAR ", "Selected Days : " + calendar_view.selectedDays)
        })

        calendar_view.selectionManager = RangeSelectionManager(OnDaySelectedListener {
            Log.e(" CALENDAR ", "========== setSelectionManager ==========")
            Log.e(" CALENDAR ", "Selected Dates : " + calendar_view.selectedDates.size)
            if (calendar_view.selectedDates.size <= 0) return@OnDaySelectedListener
            Log.e(" CALENDAR ", "Selected Days : " + calendar_view.selectedDays)
        })

        search_ok.setOnClickListener {
            val intent = Intent(this, camp_search2::class.java)
            startActivity(intent)
        }
    }
}