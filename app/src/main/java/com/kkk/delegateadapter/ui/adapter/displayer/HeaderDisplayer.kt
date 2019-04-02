package com.kkk.delegateadapter.ui.adapter.displayer

import android.view.View
import com.kkk.delegateadapter.ui.adapter.ViewType

class HeaderDisplayer:ItemDisplayer {
    override fun getViewType(): ViewType = ViewType.HEADER

    override fun bind(itemView: View) {

    }
}