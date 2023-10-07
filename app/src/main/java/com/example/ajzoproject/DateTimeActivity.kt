package com.example.ajzoproject

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.ajzoproject.databinding.ActivityDateTimeBinding
import java.util.Calendar

class DateTimeActivity : AppCompatActivity() {

//    lateinit var imdateicon : ImageView
//    lateinit var tv12june2018:TextView
//    lateinit var imenddata : ImageView
//    lateinit var tv13june2018: TextView
//    lateinit var ivStartTime : ImageView
//    lateinit var tvStartTime : TextView
//    lateinit var imendtimeicon:ImageView
//    lateinit var tvend4pm : TextView

    private lateinit var binding: ActivityDateTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_date_time)

        binding = ActivityDateTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Access the views in the layout file
      //  val textView = binding.textView


        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayShowTitleEnabled(false)

        binding.tvsingledayevent.setOnClickListener {
            binding.tvsingledayevent.setBackgroundResource(R.drawable.circel_shep_white)
            binding.tvrecurringevent.setBackgroundResource(R.drawable.circle_shap_allo)

        }

        binding.tvrecurringevent.setOnClickListener {
            binding.tvsingledayevent.setBackgroundResource(R.drawable.circle_shap_allo)
            binding.tvrecurringevent.setBackgroundResource(R.drawable.circel_shep_white)
        }


        binding.ivFirstEventStartDate.setOnClickListener {

            openCalendar()
        }

        binding.ivFirstEventEndDate.setOnClickListener {


            openCalenderEndDate()
        }


        binding.   ivFirstEventStartTime.setOnClickListener {

            showTimeDialog()
        }

        binding.   ivFirstEventEndTime.setOnClickListener {
            showTimeDialogEndTime()
        }
        binding.  tvsave.setOnClickListener {

            startActivity(Intent(this,OrganizerDetailsActivity::class.java))
        }
    }
    private fun openCalendar(){

            // Create a new DatePickerDialog instance
            val datePickerDialog = DatePickerDialog(
                this,
                { view, year, month, dayOfMonth ->
                    // Do something with the selected dat
                    val date= ""+year+"/"+month+"/"+dayOfMonth
                    binding.   tvFirstEventStartDate.setText(date)

                },
                Calendar.getInstance()[Calendar.YEAR],
                Calendar.getInstance()[Calendar.MONTH],
                Calendar.getInstance()[Calendar.DAY_OF_MONTH]
            )

            // Show the date picker dialog
            datePickerDialog.show()
        }
    private fun openCalenderEndDate(){

        // Create a new DatePickerDialog instance
        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                // Do something with the selected dat
                val date= ""+year+"/"+month+"/"+dayOfMonth
               binding. tvivFirstEventEndDate.setText(date)

            },
            Calendar.getInstance()[Calendar.YEAR],
            Calendar.getInstance()[Calendar.MONTH],
            Calendar.getInstance()[Calendar.DAY_OF_MONTH]
        )

        // Show the date picker dialog
        datePickerDialog.show()
    }
    private fun showTimeDialog() {

        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val date="/"+ hourOfDay+"/"+ minute
                // Do something with the selected time
              binding.  tvStartTime.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }
    private fun showTimeDialogEndTime() {

        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val date="/"+ hourOfDay+"/"+ minute
                // Do something with the selected time
                binding.tvFirstEventEndTime.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }




}
