package com.example.ajzoproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ajzoproject.databinding.ActivityEjzoBinding


class EjzoActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityEjzoBinding


    val ListName: MutableList<String> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejzo)
        mBinding = ActivityEjzoBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        // colors

        val blueColor = resources.getColor(R.color.blue)
        val greyColor = resources.getColor(R.color.grey)


        ListName.add("JMIL")

        mBinding.tvpersonal.setOnClickListener {
            mBinding.tvpersonal.setBackgroundResource(R.drawable.circle_shap_allo)
            mBinding.tvpersonal.setTextColor(blueColor)
            mBinding.tvbusiness.setBackgroundResource(R.drawable.circle_shap)
            mBinding.tvbusiness.setTextColor(greyColor)
        }

        mBinding.tvbusiness.setOnClickListener {
            mBinding.tvbusiness.setBackgroundResource(R.drawable.circle_shap_allo)

            mBinding.tvbusiness.setTextColor(blueColor)

            mBinding.tvpersonal.setBackgroundResource(R.drawable.circle_shap)
            mBinding.tvpersonal.setTextColor(greyColor)
        }

        mBinding.tvlogin.setOnClickListener {

            val intentObj: Intent = Intent(this, LamereretensActivity::class.java)
            val numberType = mBinding.etnumber.text.toString()
            val countryCode = mBinding.tv965kw.text.toString()
            intentObj.putExtra("number", numberType)
            intentObj.putExtra("CountryCode", countryCode)
            startActivity(intentObj)
        }
    }
}