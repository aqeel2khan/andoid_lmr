package com.example.ajzoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LamereretensActivity : AppCompatActivity() {
    val mLIstname: MutableList<String> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamereretens)
        val tvlogin = findViewById<TextView>(R.id.tvlogin)
        val tvmobileno = findViewById<TextView>(R.id.tvmobileno)
        val tv965kw = findViewById<TextView>(R.id.tv965kw)
        val tvpersonal = findViewById<TextView>(R.id.tvpersonal)
        val tvbusiness = findViewById<TextView>(R.id.tvbusiness)

        // colors

        val blueColor = resources.getColor(R.color.blue)
        val greyColor = resources.getColor(R.color.grey)

        val mIntent = intent
        var mNumber = mIntent.getStringExtra("number");
        var mCountryCode = mIntent.getStringExtra("CountryCode");

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

        tvmobileno.setText(mNumber.toString())
        tv965kw.setText(mCountryCode.toString())

        tvlogin.setOnClickListener {
            startActivity(Intent(this, BasicDetailsActivity::class.java))
        }

        mLIstname.add("name")
    }
}