package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.custom_observable.viewmodel

import androidx.lifecycle.ViewModel
import com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.custom_observable.model.CustomObservablePerson

class CustomObservableViewModel  :ViewModel(){
    var person = CustomObservablePerson("Pankaj", 26)
}