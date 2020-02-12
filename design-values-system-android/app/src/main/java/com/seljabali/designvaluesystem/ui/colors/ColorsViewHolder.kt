package com.seljabali.designvaluesystem.ui.colors

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.utilities.Res
import com.seljabali.designvaluesystem.utilities.setUnderlined

class ColorsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val itemColorViewGroup: ViewGroup = itemView.findViewById(R.id.itemColorViewGroup)
    private val colorNameTextView: TextView = itemView.findViewById(R.id.colorNameTextView)
    private val colorHexValueTextView: TextView = itemView.findViewById(R.id.colorHexValueTextView)

    fun bind(color: Colors) {
        val context = itemView.context
        itemColorViewGroup.setBackgroundColor(Res.getColor(context, color.colorId))
        colorNameTextView.text = Res.getIdentifier(context, color.colorId)!!.replace("_", " ")

        colorHexValueTextView.text = Res.getColorHex(context, color.colorId)
        itemView.invalidate()
    }
}