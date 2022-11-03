package com.example.databindingu4universe.fragment_databinding.ecomm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databindingu4universe.databinding.FragmentProductListBinding
import com.example.databindingu4universe.fragment_databinding.model.DataProvider


class ProductListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentProductListBinding =
            FragmentProductListBinding.inflate(inflater, container, false)
        binding.dataList = DataProvider.productList
        return binding.root
    }

}