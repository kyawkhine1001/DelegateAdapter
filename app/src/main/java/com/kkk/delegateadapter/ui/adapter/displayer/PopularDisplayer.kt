package com.kkk.delegateadapter.ui.adapter.displayer

import android.view.View
import com.kkk.delegateadapter.ui.adapter.ViewType

class PopularDisplayer:ItemDisplayer {
    override fun getViewType(): ViewType = ViewType.POPULAR

    override fun bind(itemView: View) {

    }
}