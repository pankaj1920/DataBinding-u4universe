package com.example.databindingu4universe.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.databindingu4universe.model.UserModel

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val mUsesr = UserModel("Ali", 20)

    fun getUser(): UserModel {
        return mUsesr
    }

}