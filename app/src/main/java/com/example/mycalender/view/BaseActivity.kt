package com.example.mycalender.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by akash on 13,01,2021
 */
abstract class BaseActivity():AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayoutId()?.let {
            setContentView(it)
        }
    }

    abstract fun setLayoutId(): Int?
}