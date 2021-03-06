package com.seljabali.designtokens.ui.cornerradiuses

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.seljabali.designtokens.R
import com.seljabali.designtokens.utilities.Res
import com.seljabali.designtokens.utilities.setUnderlined

class CornerRadiusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val cornerRadiusNameTextView: TextView = itemView.findViewById(R.id.cornerRadiusNameTextView)
    private val cornerRadiusDpValueTextView: TextView = itemView.findViewById(R.id.cornerRadiusDpValueTextView)
    private val cornerRadiusPxValueTextView: TextView = itemView.findViewById(R.id.cornerRadiusPxValueTextView)
    private val cornerRadiusView: CardView = itemView.findViewById(R.id.cornerRadiusView)

    fun bind(cornerRadius: CornerRadiuses) {
        val context = itemView.context
        cornerRadiusNameTextView.text = Res.getString(context, cornerRadius.stringId)
        cornerRadiusNameTextView.setUnderlined()

        cornerRadiusDpValueTextView.text = Res.getStringFormatted(context, R.string.colon_formatted, Res.getString(context, R.string.dp), Res.getDp(context, cornerRadius.spacingId).toString())
        cornerRadiusPxValueTextView.text = Res.getStringFormatted(context, R.string.colon_formatted, Res.getString(context, R.string.px), Res.getPx(context, cornerRadius.spacingId).toString())
        cornerRadiusView.radius = Res.getPx(context, cornerRadius.spacingId)
        itemView.invalidate()
    }
}