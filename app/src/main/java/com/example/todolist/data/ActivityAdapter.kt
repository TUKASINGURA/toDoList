package com.example.todolist.data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.DetailActivity
import com.example.todolist.R


class ActivityAdapter(var context:Context,var list:ArrayList<ActivityModel>):RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    class ActivityViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val image =itemView.findViewById<ImageView>(R.id.imageView)
        val activity =itemView.findViewById<TextView>(R.id.activity)
        val time =itemView.findViewById<TextView>(R.id.time)
        val cardview= itemView.findViewById<CardView>(R.id.my_card_view)
    }

    // for holding the Views or getting the individual elements in the view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.list_item_layout,null, false)
        return ActivityViewHolder(view)
    }
//enables us the get the number of elements to be displayed on our Views
    override fun getItemCount(): Int {

        return list.size
    }

    // connecting the viewHolder to the data
    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.activity.text= list[position].activityName
        holder.time.text=list[position].activityTime
      // implementation of the activity details
        holder.cardview.setOnClickListener{
            var intent=(Intent(context,DetailActivity::class.java))

            intent.putExtra("image", list[position].image)
            intent.putExtra("activityName",list[position].activityName)
            intent.putExtra("activityStatus", list[position].activityStatus)
            intent.putExtra("activityDescription",list[position].description)
            intent.putExtra("activityTime",list[position].activityTime)
            context.startActivity(intent)

        }

    }
}