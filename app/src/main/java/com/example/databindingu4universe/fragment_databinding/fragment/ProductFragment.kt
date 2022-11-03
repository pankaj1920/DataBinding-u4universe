package com.example.databindingu4universe.fragment_databinding.fragment

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.databindingu4universe.databinding.FragmentProductBinding
import com.example.databindingu4universe.fragment_databinding.model.Product
import com.example.databindingu4universe.fragment_databinding.viewmodel.ProductViewModel
import java.io.IOException


class ProductFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentProductBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProvider(this)
            .get(ProductViewModel::class.java)

        binding.product = viewModel.getProduct()
        binding.listner = this


//            setData(binding, viewModel.getProduct())


        return binding.root

    }

    //    private fun setData(rootView: FragmentProductBinding, product: Product) {
//
//        rootView.ivProductSale.visibility = if (product.salePrice > 0.0) View.VISIBLE else View.GONE
//        rootView.ivProduct.setImageBitmap(getBitmapFromAssets(product.image))
//
//    }
    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        return try {
            BitmapFactory.decodeStream(context?.assets?.open(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    fun runCode(view: View) {
        Toast.makeText(context, "Cilcked", Toast.LENGTH_SHORT).show()
    }

    fun productClicked(product:Product){
        Toast.makeText(context, "${product.name} is Clicked", Toast.LENGTH_SHORT).show()
    }

//    long click ek retuen type accept krta ha
//    agr koi event Handler method return type accept krta hai aur hum return type provide nhi krte hai to vo run time pe crash karega

    fun productLongClicked(product:Product):Boolean{
        Toast.makeText(context, "${product.name} is Long Clicked", Toast.LENGTH_SHORT).show()
        return true
    }

    fun checboxClicked(product: Product,isChecked:Boolean){

    }
}