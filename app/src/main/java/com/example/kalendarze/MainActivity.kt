package com.example.kalendarze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import java.text.DateFormat
import java.time.LocalDate
import java.util.*
import java.util.Calendar.getInstance
import android.widget.CalendarView.OnDateChangeListener




class MainActivity : AppCompatActivity() {
    lateinit var calendar: CalendarView
    lateinit var przycisk1: Button
    lateinit var przycisk2: Button
    lateinit var przycisk3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar = findViewById(R.id.calendarView)
        przycisk1 = findViewById(R.id.btnEtap1Rozp)
        przycisk2 = findViewById(R.id.btnEtap1Zak)
        przycisk3 = findViewById(R.id.btnEtap2)

        calendar.setMinDate(System.currentTimeMillis());
        calendar.setOnDateChangeListener(OnDateChangeListener { view, year, month, dayOfMonth ->
            val curDate = dayOfMonth.toString()
            val Year = year.toString()
            val Month = month.toString()
        })
        przycisk1.setOnClickListener{
            val data1: Long = (calendar.date)
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            przycisk1.setText(dateFormatter.format(data1))
        }
        przycisk2.setOnClickListener {
            val data2: Long = (calendar.date)
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            przycisk2.setText(dateFormatter.format(data2))
        }
        przycisk3.setOnClickListener {
            val data3: Long = (calendar.date)
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            przycisk3.setText(dateFormatter.format(data3))
        }
    }
}