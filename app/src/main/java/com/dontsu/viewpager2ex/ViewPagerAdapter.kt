package com.dontsu.viewpager2ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerAdapter (
    val images: ArrayList<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    override fun getItemCount(): Int {
       return images.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        holder.itemView.imageView.setImageResource(curImage)
    }

    inner class ViewPagerViewHolder(view: View) : RecyclerView.ViewHolder(view)

}
