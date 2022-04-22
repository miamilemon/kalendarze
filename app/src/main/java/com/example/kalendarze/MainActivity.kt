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
import android.widget.SeekBar
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var calendar: CalendarView
    lateinit var przycisk1: Button
    lateinit var przycisk2: Button
    lateinit var przycisk3: Button
    lateinit var suwak: SeekBar
    lateinit var suwakTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar = findViewById(R.id.calendarView)
        przycisk1 = findViewById(R.id.btnEtap1Rozp)
        przycisk2 = findViewById(R.id.btnEtap1Zak)
        przycisk3 = findViewById(R.id.btnEtap2)
        suwak = findViewById(R.id.seekBar)
        suwakTxt = findViewById(R.id.textSuwaka)

        calendar.setMinDate(System.currentTimeMillis());
        calendar.setOnDateChangeListener(OnDateChangeListener { _, year, month, dayOfMonth ->
            val curDate = dayOfMonth.toString()
            val Year = year.toString()
            val Month = month.toString()
            przycisk1.setOnClickListener{
                val data1: Long = (calendar.date)
                val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
                przycisk1.setText(curDate+"."+Month+"."+Year)
            }
            przycisk2.setOnClickListener {
                val data2: Long = (calendar.date)
                val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
                przycisk2.setText(curDate+"."+Month+"."+Year)
            }
            przycisk3.setOnClickListener {
                val data3: Long = (calendar.date)
                val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
                przycisk3.setText(curDate+"."+Month+"."+Year)
            }
        })
        /*suwak.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,fromUser: Boolean) {
                var a = (progress.toFloat())
                a=a/10
                suwakTxt.text = a.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })*/

    }
}