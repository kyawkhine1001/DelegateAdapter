package com.kkk.delegateadapter.ui.adapter

import androidx.annotation.LayoutRes
import com.kkk.delegateadapter.R

enum class ViewType(@LayoutRes val layoutId:Int) {
    HEADER(R.layout.item_header),
    POPULAR(R.layout.item_popular),
    ARTICLE(R.layout.item_article),
    TITLE(R.layout.item_title)
}