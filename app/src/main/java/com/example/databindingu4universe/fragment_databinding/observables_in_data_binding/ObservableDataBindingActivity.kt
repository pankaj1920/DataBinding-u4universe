package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import com.example.databindingu4universe.BR
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityObservableDataBindingBinding

class ObservableDataBindingActivity : AppCompatActivity() {

    private val person = PrimitiveObservablePerson("Pankaj", 26)
    val personList : ObservableArrayList<String> = ObservableArrayList()
    lateinit var binding: ActivityObservableDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_data_binding)

        binding.person = person
        binding.handler = this

    }

    fun onClick(view: View) {
//        person.age ++
        // in primitive observable we canot directly get or se data we need to use get and set method
        person.age.set(person.age.get()+1)
        Toast.makeText(this, "Person age is ${person.age.get()}", Toast.LENGTH_SHORT).show()
    }
}

