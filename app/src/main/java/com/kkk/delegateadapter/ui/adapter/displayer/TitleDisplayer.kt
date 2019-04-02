package com.kkk.delegateadapter.ui.adapter.displayer

import android.view.View
import com.kkk.delegateadapter.ui.adapter.ViewType
import kotlinx.android.synthetic.main.item_title.view.*

class TitleDisplayer(val title:String):ItemDisplayer {
    override fun getViewType(): ViewType = ViewType.TITLE

    override fun bind(itemView: View) {
        itemView.apply { itemTitle.text = title }
    }

}