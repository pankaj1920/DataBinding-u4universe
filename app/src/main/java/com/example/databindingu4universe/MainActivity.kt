package com.example.databindingu4universe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.databindingu4universe.databinding.MainActivityBinding
import com.example.databindingu4universe.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:MainActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(binding.root)

        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mViewModel

        //here we are binding text with name and address variable in xml file not with views in xml
        // from here data is passed to xml variable and there it will be set to the views accordingly
//        binding.name = "Pankaj Bohra"
//        binding.address = "Uttrakhand"
        binding.user = mViewModel.getUser()


    }
}