package dev.hackwithsodiq.gitng.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.hackwithsodiq.gitng.R
import dev.hackwithsodiq.gitng.retrofit.UserObject

class Adapter(val items:List<UserObject>):RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtFullname.text = items[position].login
        holder.txtUsername.text = items[position].avatarUrl
    }

    override fun getItemCount(): Int {
        return items.size
    }
}