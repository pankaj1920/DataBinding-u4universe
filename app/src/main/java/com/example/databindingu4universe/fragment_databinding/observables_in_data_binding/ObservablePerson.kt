package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.databinding.library.baseAdapters.BR

class ObservablePerson(pName: String, pAge: Int) : Observable {
    var name = pName
        @Bindable
        get() {
            return field.uppercase()
        }
        set(value) {
            field = value
            listner.notifyChange(this,BR.name)
        }

    @get:Bindable
    var age = pAge
    set(value) {
        field = value
        listner.notifyChange(this,BR.age)
    }

    val listner:PropertyChangeRegistry = PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listner.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listner.remove(callback)
    }
}