package dev.hackwithsodiq.gitng.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.hackwithsodiq.gitng.R

class ViewHolder(view:View)
    :RecyclerView.ViewHolder(view) {
        val txtUsername = view.findViewById<TextView>(R.id.txt_username)
        val txtFullname = view.findViewById<TextView>(R.id.txt_fullname)
}