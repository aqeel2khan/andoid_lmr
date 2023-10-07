package com.example.ajzoproject

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import java.util.Calendar

class TicketingSeatDetailsActivity : AppCompatActivity() {
    lateinit var tvvipseats: TextView
    lateinit var tvquantity: EditText
    lateinit var tv_available_end_time: TextView
    lateinit var iv_available_calender: ImageView
    lateinit var iv_available_end_time: ImageView
    lateinit var tv_ticket_sales_startDate: TextView
    lateinit var iv_tickets_sales_startDate: ImageView
    lateinit var tv_available_endDate: TextView
    lateinit var tv_end_date_lable2: TextView
    lateinit var iv_tickets_sales_startDate3: ImageView
    lateinit var iv_end_date_lable:ImageView
    lateinit var tvend400pm: TextView
    lateinit var iv_available_end_time4: ImageView
    lateinit var iv_tickets_start_time:ImageView
    lateinit var tvfree: TextView
    lateinit var tvpaid: TextView
    lateinit var tv_ticket_sales_start_time:TextView
    lateinit var tv_end_date_sale : TextView
    lateinit var tv_end_time_sale:TextView
    lateinit var iv_end_time_lable:ImageView

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tickeeting_seat_details1)


        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayShowTitleEnabled(false)

        tvvipseats = findViewById(R.id.tvvipseats)
        tvquantity = findViewById(R.id.tvquantity)
        iv_tickets_start_time = findViewById(R.id.iv_tickets_start_time)
        tv_available_endDate = findViewById(R.id.tv_available_endDate)
        tv_available_end_time = findViewById(R.id.tv_available_end_time)
        iv_available_calender = findViewById(R.id.iv_available_calender)
        iv_available_end_time = findViewById(R.id.iv_available_end_time)
        iv_end_date_lable = findViewById(R.id.iv_end_date_lable)
        iv_end_time_lable = findViewById(R.id.iv_end_time_lable)
        tv_ticket_sales_startDate = findViewById(R.id.tv_ticket_sales_startDate)
        iv_tickets_sales_startDate = findViewById(R.id.iv_tickets_sales_startDate)
       tv_ticket_sales_start_time = findViewById(R.id.tv_ticket_sales_start_time)


        tv_end_date_sale = findViewById(R.id.tv_end_date_sale)
        tv_end_time_sale =  findViewById(R.id.tv_end_time_sale)



        tvfree = findViewById(R.id.tvfree)
        tvpaid = findViewById(R.id.tvpaid)

//
        tvfree.setOnClickListener {
            tvfree.setBackgroundResource(R.drawable.circle_shap_allo)
            tvpaid.setBackgroundResource(R.drawable.circel_shep_white)

        }

        tvpaid.setOnClickListener {
            tvfree.setBackgroundResource(R.drawable.circel_shep_white)
            tvpaid.setBackgroundResource(R.drawable.circle_shap_allo)
        }


//        tvpaid.setOnClickListener {
//            tvpaid.setBackgroundResource(R.color.grey1)
//        }

        iv_available_calender!!.setOnClickListener {
            openCalendar1()
        }

        iv_tickets_sales_startDate!!.setOnClickListener {
            openCalendar2()
        }
        iv_available_end_time!!.setOnClickListener {

            showTimeDialog()

        }
        tv_end_time_sale!!.setOnClickListener {

            showTimeDialog2()

        }
        iv_tickets_start_time!!.setOnClickListener {

            showTimeDialog3()

        }
        iv_end_date_lable!!.setOnClickListener {

            openCalendar3()

        }
        iv_end_time_lable!!.setOnClickListener {

            showTimeDialog4()


        }

        val tvsave = findViewById<TextView>(R.id.tvsave)

        tvsave.setOnClickListener {


            val checkStatus = validation()

            if (checkStatus) {

                startActivity(Intent(this, EjzoActivity::class.java))
            }

        }
    }

    private fun showTimeDialog2() {


        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val date = "/" + hourOfDay + "/" + minute
                // Do something with the selected time

                tv_ticket_sales_start_time.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }


    private fun showTimeDialog() {

        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val date = "/" + hourOfDay + "/" + minute
                // Do something with the selected time
                tv_available_end_time.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }

    private fun openCalendar1() {

        // Create a new DatePickerDialog instance
        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                // Do something with the selected dat
                val date = "" + year + "/" + month + "/" + dayOfMonth
                tv_available_endDate.setText(date)

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
                val date = "" + year + "/" + month + "/" + dayOfMonth
                tv_ticket_sales_startDate.setText(date)

            },
            Calendar.getInstance()[Calendar.YEAR],
            Calendar.getInstance()[Calendar.MONTH],
            Calendar.getInstance()[Calendar.DAY_OF_MONTH]
        )

        // Show the date picker dialog
        datePickerDialog.show()
    }
    private fun showTimeDialog4() {


        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val date = "/" + hourOfDay + "/" + minute
                // Do something with the selected time

                tv_end_time_sale.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }

    private fun openCalendar3() {


        // Create a new DatePickerDialog instance
        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                // Do something with the selected dat
                val date = "" + year + "/" + month + "/" + dayOfMonth
                tv_end_date_sale.setText(date)

            },
            Calendar.getInstance()[Calendar.YEAR],
            Calendar.getInstance()[Calendar.MONTH],
            Calendar.getInstance()[Calendar.DAY_OF_MONTH]
        )

        // Show the date picker dialog
        datePickerDialog.show()
    }
    private fun showTimeDialog3() {


        // Create a new TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val date = "/" + hourOfDay + "/" + minute
                // Do something with the selected time

                tv_ticket_sales_start_time.setText(date)
            },
            0,
            0,
            true
        )
        timePickerDialog.show()


    }


    fun validation(): Boolean {

        var saleEndTime = tv_end_time_sale.text.toString()

        var vipSeat = tvvipseats.text.toString()

        var quantity = tvquantity.text.toString()

        var availableEndTime = tv_available_end_time.text.toString()

        var saleEndDate = tv_end_date_sale.text.toString()

        var salStartDate = tv_ticket_sales_startDate.text.toString()

        var salStarTime = tv_ticket_sales_start_time.text.toString()

        var endDateSale =  tv_end_date_sale.text.toString()

        var endTimeSale =  tv_end_time_sale.text.toString()

        if (endTimeSale == null || TextUtils.isEmpty(endTimeSale)){

            Toast.makeText(this,"Set Time",Toast.LENGTH_SHORT).show()

            return false
        }

        if (endDateSale == null ||TextUtils.isEmpty(endDateSale)){

            Toast.makeText(this,"Set Date",Toast.LENGTH_SHORT).show()

            return false
        }

        if (salStarTime == null || TextUtils.isEmpty(salStarTime)){

            Toast.makeText(this,"Set Time",Toast.LENGTH_SHORT).show()

            return false

        }

        if (salStartDate == null || TextUtils.isEmpty(salStartDate)) {

            Toast.makeText(this, "Set Date", Toast.LENGTH_SHORT).show()

            return false
        }


        if (saleEndDate == null || TextUtils.isEmpty(saleEndDate)) {

            Toast.makeText(this, "Ticket Sale End Date", Toast.LENGTH_SHORT).show()

            return false
        }

        if (vipSeat == null || TextUtils.isEmpty(vipSeat)) {

            Toast.makeText(this, "VIP Seat is Empty", Toast.LENGTH_SHORT).show()

            //Toast
            return false
        } else if (quantity == null || TextUtils.isEmpty(quantity)) {

            Toast.makeText(this, "Quantity   is Empty", Toast.LENGTH_SHORT).show()

            //Toast
            return false
        } else if (availableEndTime == null || TextUtils.isEmpty(availableEndTime)) {

            Toast.makeText(this, "End Time    is Empty", Toast.LENGTH_SHORT).show()

            //Toast
            return false
        } else if (saleEndTime == null || TextUtils.isEmpty(saleEndTime)) {

            Toast.makeText(this, "Select Date", Toast.LENGTH_SHORT).show()

            //Toast
            return false
        } else {
            return true

        }

        return false

    }


}
