package com.example.databindingu4universe.fragment_databinding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingu4universe.BR
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityProductListBinding
import com.example.databindingu4universe.fragment_databinding.model.DataProvider

class ProductListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityProductListBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_product_list)

//        binding.dataList = DataProvider.productList.toList()
        binding.setVariable(BR.dataList,DataProvider.productList.toList())
    }
}