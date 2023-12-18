package com.example.ajzoproject

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class EjzoActivity : AppCompatActivity() {
    val ListName: MutableList<String> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejzo)
        val tvwelcometo = findViewById<TextView>(R.id.tvwelcometo)
        val imejzo = findViewById<ImageView>(R.id.imejzo)
        val tvpersonal = findViewById<TextView>(R.id.tvpersonal)
        val tvbusiness = findViewById<TextView>(R.id.tvbusiness)
        val tvcountry = findViewById<TextView>(R.id.tvcountry)
        val tvmobileno = findViewById<TextView>(R.id.tvmobileno)
        val tv965kw = findViewById<TextView>(R.id.tv965kw)
//        val tvnumber = findViewById<TextView>(R.id.znumber)
        val tvlogin = findViewById<LinearLayout>(R.id.tvlogin)
        val imarbitext = findViewById<ImageView>(R.id.imarbitext)

        val etnumber = findViewById<EditText>(R.id.etnumber)

        // colors

        val blueColor = resources.getColor(R.color.blue)
        val greyColor = resources.getColor(R.color.grey)


        ListName.add("JMIL")

        tvpersonal.setOnClickListener {
            tvpersonal.setBackgroundResource(R.drawable.circle_shap_allo)
            tvpersonal.setTextColor(blueColor)
            tvbusiness.setBackgroundResource(R.drawable.circle_shap)
            tvbusiness.setTextColor(greyColor)
        }

        tvbusiness.setOnClickListener {
            tvbusiness.setBackgroundResource(R.drawable.circle_shap_allo)

            tvbusiness.setTextColor(blueColor)

            tvpersonal.setBackgroundResource(R.drawable.circle_shap)
            tvpersonal.setTextColor(greyColor)
        }

        tvlogin.setOnClickListener {

            var intentObj: Intent = Intent(this, LamereretensActivity::class.java)
            var numberType = etnumber.text.toString()
            var countryCode = tv965kw.text.toString()
            intentObj.putExtra("number", numberType)
            intentObj.putExtra("CountryCode", countryCode)
            startActivity(intentObj)
        }
    }
}