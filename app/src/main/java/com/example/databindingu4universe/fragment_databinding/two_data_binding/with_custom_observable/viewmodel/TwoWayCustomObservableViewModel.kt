package com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.viewmodel

import androidx.lifecycle.ViewModel
import com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.model.Cities
import com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.model.Gender
import com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.model.User

class TwoWayCustomObservableViewModel : ViewModel() {
    val user = User("psb@gmail.com", "psb", Gender.MALE, Cities.KARACHI)
}