package com.example.databindingu4universe.fragment_databinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityEvenListnerBindingBinding
import com.example.databindingu4universe.fragment_databinding.fragment.ProductFragment

class EvenListnerBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingActivity:ActivityEvenListnerBindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_even_listner_binding)
        bindingActivity.root

        val fragment = ProductFragment()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()
    }
}

