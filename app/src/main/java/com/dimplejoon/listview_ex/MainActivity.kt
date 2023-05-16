package com.dimplejoon.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("①","　listview学習"))
        list_item.add(ListViewModel("②","　listview学習2"))
        list_item.add(ListViewModel("③","　listview学習3"))

        val listview = findViewById<ListView>(R.id.mainListView)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter

    }
}