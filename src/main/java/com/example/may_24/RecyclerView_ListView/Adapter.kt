package com.example.may_24.RecyclerView_ListView

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.may_24.R

class Adapter(var x: List<String>, val listener: OnItemClickListener) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
val textView:TextView = ItemView.findViewById(R.id.txt_View_rcy)

    }

    // Inflates the layout for each item and creates a ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview, parent, false)

        ViewHolder(view).itemView.setOnClickListener(){
            val position = ViewHolder(view).adapterPosition
                listener.onItemClick(position)
            }

        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
return x.size
   }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){

        val item=x[position]
        holder.textView.text = item
    }
}