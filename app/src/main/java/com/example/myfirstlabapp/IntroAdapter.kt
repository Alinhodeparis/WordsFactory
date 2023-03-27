package com.example.myfirstlabapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class IntroAdapter: RecyclerView.Adapter<PagerViewHolder>() {
    private val pages = intArrayOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_intro1,parent)
        return PagerViewHolder(view)

    }

    override fun getItemCount(): Int {
        return pages.size
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.itemView.setBackgroundResource(pages[position])
    }
}
class PagerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)