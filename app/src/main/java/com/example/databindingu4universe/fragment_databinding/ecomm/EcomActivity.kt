package com.example.databindingu4universe.fragment_databinding.ecomm

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingu4universe.R
import com.example.databindingu4universe.databinding.ActivityEcomBinding
import com.example.databindingu4universe.fragment_databinding.model.Product

class EcomActivity : AppCompatActivity() ,ProducItemClickListner{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityEcomBinding = DataBindingUtil.setContentView(this,R.layout.activity_ecom)

        val fragment = ProductListFragment()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product List Fragment")
            .add(R.id.main_fragment_container,fragment,"product_list_fragment")
            .commit()
    }

    override fun onProductClicked(product: Product) {

        val fragment = ProductDetailFragment()

        val bundle = Bundle()
        bundle.putParcelable("product_key",product)
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product Detail Fragment")
            .replace(R.id.main_fragment_container, fragment,"product_detail_fragment")
            .commit()

        Toast.makeText(this, "Hi from Ecom Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onProductDetailImageClicked(product: Product) {
        Toast.makeText(this, "${product.name} is Clicked", Toast.LENGTH_SHORT).show()
    }
}