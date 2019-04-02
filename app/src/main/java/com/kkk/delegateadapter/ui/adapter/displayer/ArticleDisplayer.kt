package com.kkk.delegateadapter.ui.adapter.displayer

import android.view.View
import com.kkk.delegateadapter.ui.adapter.ViewType

class ArticleDisplayer:ItemDisplayer {
    override fun getViewType(): ViewType = ViewType.ARTICLE

    override fun bind(itemView: View) {

      }
}