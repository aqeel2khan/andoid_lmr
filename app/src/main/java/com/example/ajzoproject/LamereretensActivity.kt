package com.example.ajzoproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ajzoproject.databinding.ActivityLamereretensBinding

class LamereretensActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityLamereretensBinding
    private val mLIsName: MutableList<String> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamereretens)

        mBinding = ActivityLamereretensBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        // colors
        val blueColor = resources.getColor(R.color.blue)
        val greyColor = resources.getColor(R.color.grey)
        val mIntent = intent
        val mNumber = mIntent.getStringExtra("number")
        val mCountryCode = mIntent.getStringExtra("CountryCode")

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

        mBinding.tvmobileno.text = mNumber.toString()
        mBinding.tv965kw.text = mCountryCode.toString()

        mBinding.tvlogin.setOnClickListener {
            startActivity(Intent(this, BasicDetailsActivity::class.java))
        }

        mLIsName.add("name")
    }
}