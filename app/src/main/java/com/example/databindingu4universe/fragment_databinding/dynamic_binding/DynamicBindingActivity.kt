package com.example.databindingu4universe.fragment_databinding.dynamic_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityDynamicBindingBinding

class DynamicBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityDynamicBindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_dynamic_binding)

        binding.rvLogs.layoutManager = LinearLayoutManager(this)
        binding.rvLogs.adapter = DyanamicAdapter(DynamicUserModel.userList)

    }
}