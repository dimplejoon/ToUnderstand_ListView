package com.dimplejoon.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<ListViewModel>): BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var cView = convertView

        if (cView == null) {

            cView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)

        }

        val title = cView!!.findViewById<TextView>(R.id.listviewItem)
        val content = cView!!.findViewById<TextView>(R.id.listviewItem2)

        title.text = List[position].title
        content.text = List[position].content

        // List[0] -> ListViewModel("a","b")]
        // List[1] -> ListViewModel("b","c")]
        // List[2] -> ListViewModel("e","d")]

            return cView!!

        }
    }


