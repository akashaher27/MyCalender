package com.example.mycalender.view.calender.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mycalender.R
import com.example.mycalender.view.calender.model.AllActivityPresentationModel
import com.example.mycalender.view.common.BaseAdapter
import com.example.mycalender.view.common.BaseViewHolder
import kotlinx.android.synthetic.main.cell_personal_note.*

/**
 * Created by akash on 14,01,2021
 */
class AllActivityAdapter(private val context: Context,private val list:List<AllActivityPresentationModel>):BaseAdapter<AllActivityPresentationModel,AllActivityAdapter.AllActivityViewHolder>(list) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllActivityViewHolder {
        return AllActivityViewHolder(LayoutInflater.from(context).inflate(R.layout.cell_personal_note,parent,false))
    }

    override fun onBindViewHolder(holder: AllActivityViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    inner class AllActivityViewHolder(itemView: View):BaseViewHolder<AllActivityPresentationModel>(itemView){

            var name = itemView.findViewById<TextView>(R.id.tvName)

        override fun bindData(item: AllActivityPresentationModel) {
             name.text = item.name
        }
    }
}