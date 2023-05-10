package com.heloowinn.recyclerview_json

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(context: Context?, private val listRecyclerItem: List<Any>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val email: TextView

        init {
            name = itemView.findViewById(R.id.name)
            email = itemView.findViewById(R.id.email)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerView.ViewHolder {
        val layoutView = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.list_item, viewGroup, false
        )
        return ItemViewHolder(layoutView)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        val itemViewHolder = viewHolder as ItemViewHolder
        val user = listRecyclerItem[i] as User
        itemViewHolder.name.text = user.name
        itemViewHolder.email.text = user.email
    }

    override fun getItemCount(): Int {
        return listRecyclerItem.size
    }
}
