package com.example.mycalender.view.calender.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycalender.R
import com.example.mycalender.view.PostLoginFragment
import com.example.mycalender.view.calender.adapter.AllActivityAdapter
import com.example.mycalender.view.calender.model.AllActivityPresentationModel
import kotlinx.android.synthetic.main.bottom_sheet_all_activity.*

/**
 * Created by akash on 13,01,2021
 */
class CalenderFragment():PostLoginFragment() {

    companion object {
        fun getInstance(): CalenderFragment {
            val fragment = CalenderFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calender,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        rvAllActivity.layoutManager = LinearLayoutManager(requireContext())
        var list: ArrayList<AllActivityPresentationModel> = ArrayList()
        for(i in 1..10){
            list.add(AllActivityPresentationModel())
        }
        rvAllActivity.adapter = AllActivityAdapter(requireContext(),list)
    }
}