package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.custom_observable

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityCustomObservableBinding
import com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.custom_observable.viewmodel.CustomObservableViewModel

class CustomObservableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCustomObservableBinding
    private lateinit var viewModel: CustomObservableViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_custom_observable)

        viewModel = ViewModelProvider(this).get(CustomObservableViewModel::class.java)
        binding.viewModel = viewModel

        binding.handler = this


    }

    fun onClick(view: View) {
        viewModel.person.name = "Lathesh"
        viewModel.person.age = 30
    }
}