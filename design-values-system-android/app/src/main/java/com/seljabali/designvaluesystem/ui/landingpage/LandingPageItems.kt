package com.seljabali.designvaluesystem.ui.landingpage

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.seljabali.designvaluesystem.R

enum class LandingPageItems(@StringRes override val titleStringId: Int,
                            @DrawableRes override val iconId: Int = R.drawable.ic_launcher_background) : LandingItem {
    TEST(R.string.vertical_spacings, android.R.color.transparent),
}

