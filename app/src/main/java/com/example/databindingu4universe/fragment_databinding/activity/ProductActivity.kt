package com.example.databindingu4universe.fragment_databinding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.databindingu4universe.R
import com.example.databindingu4universe.fragment_databinding.fragment.ProductFragment

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment_container, ProductFragment(), "main_fragment")
            .commit()
    }
}
