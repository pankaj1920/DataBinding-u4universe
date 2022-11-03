package com.example.databindingu4universe.fragment_databinding.dynamic_binding

import com.example.databindingu4universe.model.UserModel

data class DynamicUserModel(
    val name: String,
    val email: String,
    val phoneNo: String,
    val message: String,
    val address: String,
    val logType: LogType
){
    enum class LogType{
        CALL,
        EMAIL,
        MESSAGE
    }
    companion object{
        val userList = listOf<DynamicUserModel>(
            DynamicUserModel("Ali","ali@gmail.com","","","Lahore",LogType.EMAIL),
            DynamicUserModel("Usman","","+1234567","","Karachi",LogType.CALL),
            DynamicUserModel("Kamran","","","Hi...","Islamabad",LogType.MESSAGE),
            DynamicUserModel("Hamza","","+1234567","","Lahore",LogType.CALL),
            DynamicUserModel("Saad","","","How are your?","Karachi",LogType.MESSAGE),
            DynamicUserModel("Umair","umair@gmail.com","","","Islamabad",LogType.EMAIL),
            DynamicUserModel("Sheraz","","","What's up?","Karachi",LogType.MESSAGE),
            DynamicUserModel("Sajid","sajid@gmail.com","","","Lahore",LogType.EMAIL),
            DynamicUserModel("Nadeem","","+1234567","","Islamabad",LogType.CALL),
            DynamicUserModel("Irfan","","","Hello","Karachi",LogType.MESSAGE),
            DynamicUserModel("Qasim","qasim@gmail.com","","","Islamabad",LogType.EMAIL)
        )

    }
}