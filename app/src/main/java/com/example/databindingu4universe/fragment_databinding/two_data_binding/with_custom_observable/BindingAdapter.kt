//clsdd ks name bindingadapter ha but ab hu BindingUtils ke name se usse access kar payenge
@file:JvmName("BindingUtils")

package com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable

import android.view.View
import android.widget.AdapterView
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.databinding.InverseMethod
import com.example.databindingu4universe.R
import com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.model.Cities
import com.example.databindingu4universe.fragment_databinding.two_data_binding.with_custom_observable.model.Gender

/*
@BindingAdapter("android:text")
fun setText(view:EditText,value:String){
    Log.d("myTag","setText : called for $value")
    if (value != view.text.toString())
        view.setText(value)
}*/

//this method will be used to set value on view
@BindingAdapter("gender")
fun setGender(view: RadioGroup, gender: Gender) {
    when (gender) {
        Gender.MALE -> view.check(R.id.rb_male)
        Gender.FEMALE -> view.check(R.id.rb_female)
    }
}

//this method will be used to get value from view
// Imp -> @BindingAdapter("gender") and @InverseBindingAdapter(attribute = "gender") should have same name i.e gender
@InverseBindingAdapter(attribute = "gender")
fun getGender(view: RadioGroup): Gender {
    return when (view.checkedRadioButtonId) {
        R.id.rb_male -> Gender.MALE
        R.id.rb_female -> Gender.FEMALE
        else -> Gender.MALE
    }
}

// upr ke do method humne view se data get or set krne ke liye banye ha
// ye method se pata chelga ka hume kb data get krna hai
//gender+AttrChanged issme "AttrChanged"  fixed rahega vo android generate krta hai aur gender humne upr attribute diya hai
// iss method me listner:InverseBindingListener automatic view se pass hoga
@BindingAdapter("genderAttrChanged")
fun setGenderListener(view: RadioGroup, listner: InverseBindingListener) {
//    jaise hi lister.onChange() call hoga toh databinding ko ye notification jayega view se value ab get krna ha
    // ye method notifyChange jo hum model ke andar use krte hai uske similar hai
    //1-> notifyChange => hume bata hai model change ho gya hai view ko change kro
    //2--> listner.onChange() -> hume bata hai view change ho gya hai model ko change kro
//    listner.onChange()

    view.setOnCheckedChangeListener { group, checkId ->
        //ye har baar call hoga jb hum radio button click karenge
        listner.onChange()
    }

}


// this method will take data model and set it to view
@InverseMethod("buttonIdToGender")
fun genderButtonToId(gender: Gender): Int {
    return if (gender == Gender.MALE) R.id.rb_male else R.id.rb_female
}

//this inverse method is will we used to get data from view and set it to model
fun buttonIdToGender(buttonId: Int): Gender {
    return if (buttonId == R.id.rb_male) Gender.MALE else Gender.FEMALE
}


@BindingAdapter("setCity")
fun setCity(view: Spinner, city: Cities) {
    view.setSelection(city.ordinal)
}

@InverseBindingAdapter(attribute = "setCity")
fun getCity(view: Spinner): Cities {
    return Cities.values().get(view.selectedItemPosition)
}

@BindingAdapter("setCityAttrChanged")
fun setCityListner(view: Spinner, listener: InverseBindingListener) {
    if (view.onItemClickListener == null) {
        view.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                listener.onChange()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

}

@InverseMethod("positionToCity")
fun cityToPosition(cities: Cities): Int {
//    ordinaml will return the positon of selected item of spinner
    return cities.ordinal
}

fun positionToCity(position: Int): Cities {
    return Cities.values()[position]
}