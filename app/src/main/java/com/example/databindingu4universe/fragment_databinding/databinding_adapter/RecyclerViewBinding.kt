package com.example.databindingu4universe.fragment_databinding.databinding_adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingu4universe.fragment_databinding.adapter.ProductsListAdapter
import com.example.databindingu4universe.fragment_databinding.ecomm.adapter.ProductsItemAdapter
import com.example.databindingu4universe.fragment_databinding.model.Product

@BindingAdapter("bindList")
fun bindRecyclerViewList(view: RecyclerView, dataList: List<Product>) {
    if (dataList.isEmpty()) {
        return
    }
    val layoutManager = view.layoutManager
    if (layoutManager == null) {
        view.layoutManager = GridLayoutManager(view.context, 2)
    }

    var adapter = view.adapter
    if (adapter == null) {
        adapter = ProductsItemAdapter(view.context, dataList.toMutableList())
        view.adapter = adapter
    }
//    adapter.updateDataList(dataList)
}