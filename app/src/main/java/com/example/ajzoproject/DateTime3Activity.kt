package com.example.ajzoproject

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import java.util.Calendar


class DateTime3Activity() : AppCompatActivity() {

   lateinit var tv12june2018:TextView
   lateinit var imenddata : ImageView
   lateinit var tv13june2018 : TextView
   lateinit var ivStartTime : ImageView
   lateinit var tvStartTime : TextView
   lateinit var imendtimeicon : ImageView
   lateinit var tvend4pm : TextView
   lateinit var tvsingledayevent:TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time3)

        val imdateicon = findViewById<ImageView>(R.id.imdateicon)
        val tvsave = findViewById<TextView>(R.id.tvsave)


        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayShowTitleEnabled(false)

        tv13june2018 = findViewById<TextView>(R.id.tv13june2018)
         imenddata = findViewById<ImageView>(R.id.imenddata)
        ivStartTime = findViewById<ImageView>(R.id.ivStartTime)
        tvStartTime = findViewById(R.id.tvStartTime)
        imendtimeicon=findViewById(R.id.imendtimeicon)
        tvend4pm = findViewById(R.id.tvend4pm)
        tvsingledayevent = findViewById(R.id.tvsingledayevent)
       val tvrecurringevent = findViewById<TextView>(R.id.tvrecurringevent)


        tvsingledayevent.setOnClickListener {
            tvsingledayevent.setBackgroundResource(R.drawable.circle_shap_allo)
            tvrecurringevent.setBackgroundResource(R.drawable.circel_shep_white)

        }

        tvrecurringevent.setOnClickListener {
            tvrecurringevent.setBackgroundResource(R.drawable.circel_shep_white)
            tvsingledayevent.setBackgroundResource(R.drawable.circle_shap_allo)
        }

        tv12june2018 = findViewById<TextView>(R.id.tv12june2018)

        imenddata.setOnClickListener {

            openCalendar2()
        }
        imdateicon.setOnClickListener {

            openCalendar()
        }
        ivStartTime.setOnClickListener {
            showTimeDialog()

        }
        imendtimeicon.setOnClickListener {
            showTimeDialog2()
        }

        tvsave.setOnClickListener {

            startActivity(Intent(this, LocationActivity::class.java))
        }


    }

    private fun showTimeDialog() {

        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener {view, hourOfDay, minute ->
                val date="/"+ hourOfDay+"/"+ minute
                // Do something with the selected time
                tvStartTime.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()

        // Create a new TimePickerDialog

    }

    private fun showTimeDialog2() {

        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener {view, hourOfDay, minute ->
                val date="/"+ hourOfDay+"/"+ minute
                // Do something with the selected time
                tvStartTime.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }


    private fun openCalendar() {
        // Create a new DatePickerDialog instance
        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                // Do something with the selected dat
                val date= ""+year+"/"+month+"/"+dayOfMonth
                tv12june2018.setText(date)

            },
            Calendar.getInstance()[Calendar.YEAR],
            Calendar.getInstance()[Calendar.MONTH],
            Calendar.getInstance()[Calendar.DAY_OF_MONTH]
        )

        // Show the date picker dialog
        datePickerDialog.show()
    }
    private fun openCalendar2() {
        // Create a new DatePickerDialog instance
        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                // Do something with the selected dat
                val date= ""+year+"/"+month+"/"+dayOfMonth
                tv13june2018.setText(date)

            },
            Calendar.getInstance()[Calendar.YEAR],
            Calendar.getInstance()[Calendar.MONTH],
            Calendar.getInstance()[Calendar.DAY_OF_MONTH]
        )

        // Show the date picker dialog
        datePickerDialog.show()
    }





}





