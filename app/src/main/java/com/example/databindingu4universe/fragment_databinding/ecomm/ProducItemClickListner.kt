package com.example.databindingu4universe.fragment_databinding.ecomm

import com.example.databindingu4universe.fragment_databinding.model.Product

interface ProducItemClickListner {
    fun onProductClicked(product: Product)
    fun onProductDetailImageClicked(product: Product)
}