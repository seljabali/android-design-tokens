package com.seljabali.designvaluesystem.ui.landingpage

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.LandingItem

enum class LandingPageItems(@StringRes override val titleStringId: Int,
                            @DrawableRes override val iconId: Int = R.drawable.ic_launcher_background) :
    LandingItem {
    SPACING(R.string.spacings, android.R.color.transparent),
    TEXT_SIZES(R.string.text_sizes, android.R.color.transparent),
    CORNER_RADIUS(R.string.corner_radiuses, android.R.color.transparent),
    ELEVATIONS(R.string.elevations, android.R.color.transparent),
    LETTER_SPACINGS(R.string.letter_spacings, android.R.color.transparent),
}