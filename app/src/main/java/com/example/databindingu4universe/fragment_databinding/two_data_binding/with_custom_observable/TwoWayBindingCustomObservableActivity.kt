package com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityTwoWayBindingCustomObservableBinding
import com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.viewmodel.TwoWayCustomObservableViewModel

class TwoWayBindingCustomObservableActivity : AppCompatActivity() {
    lateinit var binding: ActivityTwoWayBindingCustomObservableBinding
    lateinit var viewModel: TwoWayCustomObservableViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_two_way_binding_custom_observable
        )
        viewModel = ViewModelProvider(this).get(TwoWayCustomObservableViewModel::class.java)
        binding.listner = this
        binding.viewModel = viewModel

    }

    fun runCode(view: View){

    }
}