package com.android.ashwin.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val items: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        initViews()
    }

    private fun initData() {
        items.add("alpha")
        items.add("beta")
        items.add("cupcake")
        items.add("donut")
        items.add("eclairs")
        items.add("froyo")
        items.add("gingerbread")
        items.add("honeycomb")
        items.add("icecream sandwich")
        items.add("jelly bean")
        items.add("kitkat")
        items.add("lollipop")
        items.add("marshmallow")
        items.add("nougat")
        items.add("oreo")
        items.add("pie")
    }

    private fun initViews() {
        my_recyclerview.layoutManager = LinearLayoutManager(this)
        my_recyclerview.adapter = RecyclerAdapter(this, items)
    }
}
