package com.example.databindingu4universe.fragment_databinding.ecomm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databindingu4universe.databinding.FragmentProductDetailBinding
import com.example.databindingu4universe.fragment_databinding.model.Product


class ProductDetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProductDetailBinding.inflate(inflater, container, false)

        val product = arguments?.getParcelable<Product>("product_key")
        binding.product = product!!
        binding.listner = context as ProducItemClickListner
        return binding.root
    }

}