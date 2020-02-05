package com.seljabali.designvaluesystem.ui.textsizes.textsizeselector

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.LandingItem

enum class TextSizeTypeLandingItem(@StringRes override val titleStringId: Int,
                                   @DrawableRes override val iconId: Int = R.drawable.ic_launcher_background) :
    LandingItem {
    CUSTOM(R.string.custom_sizes, android.R.color.transparent),
    APP_COMPAT(R.string.app_compat, android.R.color.transparent),
}