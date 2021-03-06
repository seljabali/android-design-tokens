package com.seljabali.designtokens.ui.textappearances

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.seljabali.designtokens.R
import com.seljabali.designtokens.utilities.Res
import com.seljabali.designtokens.utilities.getSp
import com.seljabali.designtokens.utilities.setTextAppearanceStyle
import com.seljabali.designtokens.utilities.setUnderlined

class TextStyleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textStyleNameTextView: TextView = itemView.findViewById(R.id.textStyleNameTextView)
    private val textStyleSizeSpTextView: TextView = itemView.findViewById(R.id.textStyleSizeSpTextView)
    private val textStyleSizePxTextView: TextView = itemView.findViewById(R.id.textStyleSizePxTextView)
    private val textStyleDisplayTextView: TextView = itemView.findViewById(R.id.textStyleDisplayTextView)

    fun bind(textStyle: TextStyles) {
        val context = itemView.context
        textStyleNameTextView.text = Res.getString(context, textStyle.textAppearanceName)
        textStyleNameTextView.setUnderlined()

        textStyleDisplayTextView.setTextAppearanceStyle(itemView.context, textStyle.textAppearanceStyle)

        val textSizePxText = "${textStyleDisplayTextView.textSize} PX"
        textStyleSizeSpTextView.text = textSizePxText

        val textSizeSpText = "${textStyleDisplayTextView.getSp()} SP"
        textStyleSizePxTextView.text = textSizeSpText

        itemView.invalidate()
    }
}