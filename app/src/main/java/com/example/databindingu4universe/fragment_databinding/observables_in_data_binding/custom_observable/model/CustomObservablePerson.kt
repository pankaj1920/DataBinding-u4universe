package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.custom_observable.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databindingu4universe.BR

class CustomObservablePerson(pName: String, pAge: Int) : BaseObservable() {
    @get:Bindable
    var name:String = pName
    set(value) {
        field = value
        notifyPropertyChanged(BR.name)
        // if we use notifyChange() it will update all the field value for that model
//        notifyChange()
    }
    @get:Bindable
    var age:Int = pAge
    set(value) {
        field = value
        notifyPropertyChanged(BR.age)
    }
}