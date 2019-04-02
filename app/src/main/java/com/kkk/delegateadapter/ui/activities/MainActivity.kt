package com.kkk.delegateadapter.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kkk.delegateadapter.R
import com.kkk.delegateadapter.ui.adapter.DelegateAdapter
import com.kkk.delegateadapter.ui.adapter.displayer.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mItemList = mutableListOf<ItemDisplayer>()
    private val mAdapter:DelegateAdapter= DelegateAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainRV.layoutManager = GridLayoutManager(applicationContext,1)
        mainRV.adapter = mAdapter

        mItemList.add(HeaderDisplayer())

        mItemList.add(TitleDisplayer("Popular"))
        mItemList.add(PopularDisplayer())

        mItemList.add(TitleDisplayer("Latest"))
        mItemList.add(PopularDisplayer())

        mItemList.add(TitleDisplayer("Article"))
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())
        mItemList.add(ArticleDisplayer())

        mAdapter.setData(mItemList)
    }
}
