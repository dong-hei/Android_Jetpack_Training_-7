package com.dk.sharedpreference2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Str
        val preferenceUtils = PreferenceUtils(this)
        val putStrBtn = findViewById<Button>(R.id.putStrBtn)
        putStrBtn.setOnClickListener {

            val putStrArea = findViewById<EditText>(R.id.putStrArea).text.toString()

            preferenceUtils.putStr(KeyList.MY_STR_KEY, putStrArea)
        }

        val getStrBtn = findViewById<Button>(R.id.getStrBtn)
        getStrBtn.setOnClickListener {

            val getData = preferenceUtils.getStr(KeyList.MY_STR_KEY)

            Toast.makeText(this, getData , Toast.LENGTH_SHORT).show()

        }

        val trueBtn = findViewById<Button>(R.id.trueBtn)
        val falseBtn = findViewById<Button>(R.id.falseBtn)
        val getBooleanBtn = findViewById<Button>(R.id.getBooleanBtn)

        trueBtn.setOnClickListener {
            preferenceUtils.putBoolean(KeyList.MY_BOOL_KEY, true)
        }

        falseBtn.setOnClickListener {
            preferenceUtils.putBoolean(KeyList.MY_BOOL_KEY, false)

        }

        getBooleanBtn.setOnClickListener {
            val getData = preferenceUtils.getBoolean(KeyList.MY_BOOL_KEY)

            Toast.makeText(this, getData.toString(), Toast.LENGTH_SHORT).show()
        }


    }
}