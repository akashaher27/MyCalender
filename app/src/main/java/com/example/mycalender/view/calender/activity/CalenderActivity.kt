package com.example.mycalender.view.calender.activity

import android.os.Bundle
import com.example.mycalender.R
import com.example.mycalender.view.PostLoginActivity
import com.example.mycalender.view.calender.fragment.CalenderFragment
import com.example.mycalender.view.common.addFragment
import kotlinx.android.synthetic.main.activity_calender.*

/**
 * Created by akash on 13,01,2021
 */
class CalenderActivity():PostLoginActivity() {

    override fun setLayoutId(): Int? = R.layout.activity_calender

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finish()
        }
        else{ super.onBackPressed() }
    }

    private fun initView() {
        launchCalenderFragment()
    }

    private fun launchCalenderFragment(){
        val frag = CalenderFragment.getInstance()
        addFragment(R.id.fragHolder, supportFragmentManager, frag, null)
    }
}
