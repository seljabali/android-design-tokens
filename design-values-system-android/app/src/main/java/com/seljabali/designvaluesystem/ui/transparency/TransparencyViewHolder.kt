package com.seljabali.designvaluesystem.ui.transparency

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.utilities.Res

class TransparencyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val transparencyView: TextView = itemView.findViewById(R.id.transparencyView)

    fun bind(transparency: Transparencies) {
        val context = itemView.context
        transparencyView.alpha = Res.getFloat(context, transparency.transparencyId)
        itemView.invalidate()
    }
}