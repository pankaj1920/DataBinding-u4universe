package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class PrimitiveObservablePerson (pName:String,page:Int){
    // for string there is no ObservablePrimitive
    // here we are giving default value to name and age in ObservableField(pName) and ObservableInt(page) but it is not mandatory
    var name : ObservableField<String> = ObservableField(pName)
    // we have primitiveObservable for int so we are using that
    var age:ObservableInt = ObservableInt(page)
}