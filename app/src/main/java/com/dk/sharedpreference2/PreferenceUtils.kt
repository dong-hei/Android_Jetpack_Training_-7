package com.dk.sharedpreference2

import android.content.Context
import android.renderscript.Sampler.Value

class PreferenceUtils(context: Context) {

    private val sharedPreference = context.getSharedPreferences("sharedPreference", Context.MODE_PRIVATE)

    fun putStr(key: String, value : String){
        with(sharedPreference.edit()) {
            putString(key,value)
            apply()
        }

    }

    fun getStr(key : String) : String?{
        return sharedPreference.getString(key, "defaultStr")

    }

    fun putBoolean(key: String, value : Boolean){
        with(sharedPreference.edit()) {
            putBoolean(key,value)
            apply()
        }
    }

    fun getBoolean(key : String) : Boolean{
        return sharedPreference.getBoolean(key, false)
    }
}