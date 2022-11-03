package com.example.databindingu4universe.fragment_databinding.dynamic_binding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingu4universe.BR
import com.example.databindingu4universe.databinding.ItemCallBinding
import com.example.databindingu4universe.databinding.ItemEmailBinding
import com.example.databindingu4universe.databinding.ItemMessageBinding


/*
* the order of these item should be same as defined in Enum class of DynamicUser model
* TYPE_CALL = 0, TYPE_EMAIL = 1 , TYPE_MESSAGE = 2
* internally in enum class if value of 1st item is 0 and baki value increment hoti jayegi jitne item honge
* */
private const val TYPE_CALL = 0
private const val TYPE_EMAIL = 1
private const val TYPE_MESSAGE = 2

class DyanamicAdapter(private val userList: List<DynamicUserModel>) :
    RecyclerView.Adapter<DyanamicAdapter.BindingViewHolder>() {


    class BindingViewHolder(val itemview: ViewDataBinding) : RecyclerView.ViewHolder(itemview.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding = when (viewType) {
            TYPE_CALL -> {
                ItemCallBinding.inflate(layoutInflater, parent, false)
            }
            TYPE_EMAIL -> {
                ItemEmailBinding.inflate(layoutInflater, parent, false)
            }
            TYPE_MESSAGE -> {
                ItemMessageBinding.inflate(layoutInflater, parent, false)
            }
            else -> throw IllegalArgumentException("Unknown view type")
        }

        return BindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val user = userList.get(position)
        holder.itemview.setVariable(BR.dynamicUser,user)
        holder.itemview.executePendingBindings()
    }

    override fun getItemViewType(position: Int): Int {
        return userList.get(position).logType.ordinal
    }

    override fun getItemCount(): Int = userList.size

}