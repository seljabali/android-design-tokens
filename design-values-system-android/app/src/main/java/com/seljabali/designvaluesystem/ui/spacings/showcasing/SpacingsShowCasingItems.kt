package com.seljabali.designvaluesystem.ui.spacings.showcasing

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.LandingItem

enum class SpacingsShowCasingItems(@StringRes override val titleStringId: Int,
                                   @DrawableRes override val iconId: Int = R.drawable.ic_launcher_background) : LandingItem {
    VERTICAL(R.string.vertical, R.mipmap.vertical_spacing),
    HORIZONTAL(R.string.horizontal, R.mipmap.spacing),
    PADDING(R.string.padding, R.mipmap.padding),
}