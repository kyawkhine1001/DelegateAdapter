package com.kkk.delegateadapter.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kkk.delegateadapter.ui.adapter.displayer.ItemDisplayer

class DelegateAdapter : RecyclerView.Adapter<BaseViewHolder>(){

    var items = mutableListOf<ItemDisplayer>()

    override fun getItemViewType(position: Int): Int = items[position].getViewType().ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
        BaseViewHolder(LayoutInflater.from(parent.context).inflate(ViewType.values()[viewType].layoutId, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = items[position].bind(holder.itemView)

    fun setData(items:MutableList<ItemDisplayer>){
        this.items = items
        notifyDataSetChanged()
    }
}