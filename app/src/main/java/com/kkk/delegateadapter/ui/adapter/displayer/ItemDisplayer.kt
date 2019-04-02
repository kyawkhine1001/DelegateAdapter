package com.kkk.delegateadapter.ui.adapter.displayer

import android.view.View
import com.kkk.delegateadapter.ui.adapter.ViewType

interface ItemDisplayer {
    fun getViewType():ViewType
    fun bind(itemView:View)
}