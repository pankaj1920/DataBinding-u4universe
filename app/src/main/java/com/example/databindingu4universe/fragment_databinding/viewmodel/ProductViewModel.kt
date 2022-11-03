package com.example.databindingu4universe.fragment_databinding.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.databindingu4universe.fragment_databinding.model.DataProvider
import com.example.databindingu4universe.fragment_databinding.model.Product

class ProductViewModel(application:Application):AndroidViewModel(application) {
    private var product:Product = DataProvider.productList.get(1)

    fun getProduct():Product = product
}