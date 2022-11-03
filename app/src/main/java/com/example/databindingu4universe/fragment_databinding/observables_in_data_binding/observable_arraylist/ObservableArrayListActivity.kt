package com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.observable_arraylist

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import androidx.databinding.ObservableList
import com.example.databindingu4universe.BR
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityArrayListBindingBinding
import com.example.databindingu4universe.databinding.ActivityObservableDataBindingBinding
import com.example.databindingu4universe.fragment_databinding.observables_in_data_binding.PrimitiveObservablePerson

class ObservableArrayListActivity : AppCompatActivity() {

    val data : ObservableArrayList<String> = ObservableArrayList()
    val mapData:ObservableArrayMap<String,Any> = ObservableArrayMap()
    lateinit var binding: ActivityArrayListBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding =
            DataBindingUtil.setContentView(this, R.layout.activity_array_list_binding)

        data.add("Pankaj")
        data.add("Lathesh")

        mapData.put("name","Ali")
        mapData.put("age",21)

//        binding.data = data
        binding.mapData = mapData
        binding.handler = this

    }

    fun onClick(view: View) {
        data.add(0,"Kamal")
        mapData.put("name","Rakesh")
        Toast.makeText(this, "Person age is ${data.get(0)}", Toast.LENGTH_SHORT).show()
    }
}

