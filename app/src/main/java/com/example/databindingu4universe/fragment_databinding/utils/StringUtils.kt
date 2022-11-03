package com.example.databindingu4universe.fragment_databinding.utils


object StringUtils {
    @JvmStatic
    fun getTotalRating(totalRating: Int): String {
        return "($totalRating)"
    }

    @JvmStatic
    fun getFormattedPrice(price: Double): String {
        return "$ $price"
    }
}