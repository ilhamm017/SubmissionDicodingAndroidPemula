package com.example.submissionsilham

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class KarakterAdapter(private val karakter: List<DataClassKarakter>) :

    RecyclerView.Adapter<KarakterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_content, parent, false)
        val descrip = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_detail, parent, false)
        return ViewHolder(view,descrip)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kt = karakter[position]
        holder.title.text = kt.name
        Glide.with(holder.itemView.context)
            .load(kt.image)
            .into(holder.image)
        holder.detail.text = kt.detail
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java )
            intent.putExtra(DetailActivity.EXTRA_CHARACTER, kt)
            holder.itemView.context.startActivity(intent)
        }
        holder.description.text = kt.deskripsi
    }

    override fun getItemCount(): Int = karakter.size

    inner class ViewHolder(itemView: View, itemDisc: View): RecyclerView.ViewHolder(itemView) {
            val title: TextView = itemView.findViewById(R.id.text_view_content_title)
            val image: ImageView = itemView.findViewById(R.id.image_content)
            val detail: TextView = itemView.findViewById(R.id.text_view_content_description)
            val description: TextView = itemDisc.findViewById((R.id.text_view_detail_description))
    }
}