package com.example.ajzoproject
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class BasicDetailsActivity : AppCompatActivity() {
    lateinit var   customSpinner :Spinner
    lateinit var   customSpinner2 :Spinner
    lateinit var  custom_spinner3 : Spinner
    lateinit var etnumber:EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_details)


        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayShowTitleEnabled(false)


        val tvsave = findViewById<TextView>(R.id.tvsave)


         customSpinner = findViewById<Spinner>(R.id.custom_spinner)

        customspinnerEvent();

        customSpinner2 = findViewById<Spinner>(R.id.custom_spinner2)

        customspinnertChooseEventCategory();

       custom_spinner3 = findViewById<Spinner>(R.id.custom_spinner3)

        customSpinnerTotalMaximumCapacity();

        tvsave.setOnClickListener {

            startActivity(Intent(this,EventDescriptionActivity::class.java))
        }
    }


    fun customspinnerEvent(){

        // Create an array of items for your dropdown

        // Create an array of items for your dropdown
        val items = arrayOf("Marriage 1", "Party 2", "Birthday  3", "Anniversary 4", "Rewards Party 5")

        // Create a custom ArrayAdapter with your custom item layout

        // Create a custom ArrayAdapter with your custom item layout
        val adapter = ArrayAdapter<String>(this, R.layout.custom_dropdown_item, items)

        // Set the adapter for the Spinner

        // Set the adapter for the Spinner
        customSpinner.adapter = adapter
    }

    fun customspinnertChooseEventCategory(){

        // Create an array of items for your dropdown

        // Create an array of items for your dropdown
        val items = arrayOf("Dawat Waleema1", "Reception ", "Price Reward", "Annual Party", "Eid Party")

        // Create a custom ArrayAdapter with your custom item layout

        // Create a custom ArrayAdapter with your custom item layout
        val adapter = ArrayAdapter<String>(this, R.layout.custom_dropdown_item, items)

        // Set the adapter for the Spinner

        // Set the adapter for the Spinner
        customSpinner2.adapter = adapter
    }

    fun customSpinnerTotalMaximumCapacity(){

        // Create an array of items for your dropdown

        // Create an array of items for your dropdown
        val items = arrayOf("100-200", "200-300 ", "300-400", "400-500")

        // Create a custom ArrayAdapter with your custom item layout

        // Create a custom ArrayAdapter with your custom item layout
        val adapter = ArrayAdapter<String>(this, R.layout.custom_dropdown_item, items)

        // Set the adapter for the Spinner

        // Set the adapter for the Spinner
        custom_spinner3.adapter = adapter
    }


}