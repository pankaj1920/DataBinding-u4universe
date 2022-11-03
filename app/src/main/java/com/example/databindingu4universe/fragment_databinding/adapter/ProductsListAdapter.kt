package com.example.databindingu4universe.fragment_databinding.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingu4universe.BR
import com.example.databindingu4universe.databinding.ProductItemBinding
import com.example.databindingu4universe.fragment_databinding.model.Product

class ProductsListAdapter(
    private val context: Context,
    private val dataList: MutableList<Product>
) :
    RecyclerView.Adapter<ProductsListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val binding = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        val binding: ViewDataBinding =
            ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val product = dataList[position]

//        holder.binding.productItem = product
        holder.binding.setVariable(BR.productItem, product)
        holder.binding.executePendingBindings()

/*
        holder.tvName.text = product.name
        holder.tvPrice.text = "${product.price}$ "
        holder.tvRating.rating = product.rating
        holder.tvNumRating.text = "(${product.totalRatings})"

        try {
            val bitmap = BitmapFactory.decodeStream(context.assets.open(product.image))
            holder.ivProduct.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        holder.ivSale.visibility = if (product.salePrice > 0) VISIBLE else GONE
*/

    }

    fun updateDataList(data: List<Product>) {
        dataList.clear()
        dataList.addAll(data)
        notifyDataSetChanged()
    }

    override fun getItemCount() = dataList.size

    //    class MyViewHolder(val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root) {
    class MyViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        /* val tvName = binding.tvName
         val tvPrice = binding.tvPrice
         val tvRating = binding.ratingBar
         val tvNumRating = binding.tvNumRating

         val ivProduct = binding.ivProduct
         val ivSale = binding.ivProductSale*/

    }

}