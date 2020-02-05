package com.seljabali.designvaluesystem.ui.spacings.padding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seljabali.designvaluesystem.R

class PaddingsAdapter : RecyclerView.Adapter<PaddingViewHolder>() {

    private var Paddings: Array<Paddings> = emptyArray()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaddingViewHolder =
        PaddingViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_padding, parent, false
            ))

    override fun getItemCount(): Int =  Paddings.size

    override fun onBindViewHolder(holder: PaddingViewHolder, position: Int) {
        val verticalSpacingAtPosition = getItem(position)
        holder.bind(verticalSpacingAtPosition)
    }

    override fun getItemId(position: Int): Long = position.toLong()

    fun setPaddings(values: Array<Paddings>) {
        Paddings = values
        notifyDataSetChanged()
    }

    private fun getItem(position: Int): Paddings = Paddings[position]

}