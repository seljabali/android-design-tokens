package com.seljabali.designtokens.ui.transparency

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.seljabali.designtokens.R
import com.seljabali.designtokens.utilities.Res
import com.seljabali.designtokens.utilities.setUnderlined

class TransparencyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val transparencyView: TextView = itemView.findViewById(R.id.transparencyView)
    private val transparencyNameTextView: TextView = itemView.findViewById(R.id.transparencyNameTextView)
    private val transparencyValueTextView: TextView = itemView.findViewById(R.id.transparencyValueTextView)

    fun bind(transparency: Transparencies) {
        val context = itemView.context
        val transparencyValue: Float = Res.getFloat(context, transparency.transparencyId)
        transparencyNameTextView.text = Res.getString(context, transparency.stringId)
        transparencyNameTextView.setUnderlined()
        transparencyValueTextView.text = transparencyValue.toString()
        transparencyView.alpha = transparencyValue
        itemView.invalidate()
    }
}