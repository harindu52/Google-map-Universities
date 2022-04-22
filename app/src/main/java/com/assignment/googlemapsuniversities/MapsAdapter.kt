package com.assignment.googlemapsuniversities

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

//private const val Tag="mapsAdapter"
class MapsAdapter(private val context: Context, private val unimap: List<UniMap>,val onClickListener: OnClickListener) : RecyclerView.Adapter<MapsAdapter.ViewHolder>() {
    interface OnClickListener{
        fun onItemClick(position: Int)
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textCard:TextView=itemView.findViewById(R.id.textCard)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.card_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return unimap.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val uni=unimap[position]
        holder.textCard.text=uni.title
        holder.itemView.setOnClickListener {
            //Log.i(Tag,"$position")
            onClickListener.onItemClick(position)
        }

        //val textViewTitle:TextView=holder.itemView.findViewById(R.id.textCard)
        //textViewTitle.text=uni.title.toString()
    }

}
