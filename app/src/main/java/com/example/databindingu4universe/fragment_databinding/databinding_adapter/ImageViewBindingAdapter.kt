package com.example.databindingu4universe.fragment_databinding.databinding_adapter

import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.io.IOException

@BindingAdapter("imageName")
fun setImageFromAssets(view: ImageView, fileName: String) {
    try {
        val bitmap = BitmapFactory.decodeStream(view.context?.assets?.open(fileName))
        view.setImageBitmap(bitmap)
    } catch (e: IOException) {
        e.printStackTrace()
    }
}
/*

//if we make requireAll = True then all parameter should be passed from view else it will give exception
// here we had make requrieAll = False bcz we need "placeholderImage", "errorImage" as optional
@BindingAdapter(value = ["imageUrl", "placeholderImage", "errorImage"], requireAll = false)
fun loadImageFromUrl(
    view: ImageView,
    imageUrl: String,
    placeholderImage: String,
    errorImage: String
) {
    Glide.with(view.context)
        .load(imageUrl).into(view)
}//if we make requireAll = True then all parameter should be passed from view else it will give exception
*/

// here we had make requrieAll = False bcz we need "placeholderImage", "errorImage" as optional
@BindingAdapter(value = ["imageUrl", "placeholderImage"], requireAll = false)
fun loadImageFromUrl(
    view: ImageView,
    imageUrl: String,
    placeholderImage: Drawable
) {
    val requestOption = RequestOptions()
        .placeholder(placeholderImage)
    Glide.with(view.context)
        .setDefaultRequestOptions(requestOption)
        .load(imageUrl).into(view)
}

@BindingAdapter("priceText")
fun priceText(view:TextView,price:Double){
    view.text = "Rs ${price}/each"
}

//we can create custom adapter for build in android attrbiute
//`1    `