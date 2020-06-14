package com.tsyanuri.android.dicodingsubmission

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListComposerAdapter(val listComposer: ArrayList<Composer>) : RecyclerView.Adapter<ListComposerAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_composer, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {


        val composer : Composer = listComposer[position]

        Glide.with(holder.itemView.context)
            .load(composer.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = composer.name
        holder.tvDetail.text = composer.detail

        /*Retrieve Data from list to Detail Composer class*/
        val bioContext : Context = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(bioContext, DetailComposer::class.java)
            moveDetail.putExtra(DetailComposer.EXTRA_NAME, composer.name)
            moveDetail.putExtra(DetailComposer.EXTRA_DETAIL, composer.detail)
            moveDetail.putExtra(DetailComposer.EXTRA_PHOTO, composer.photo)
            bioContext.startActivity(moveDetail)
        }

    }

    override fun getItemCount(): Int {
        return  listComposer.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
