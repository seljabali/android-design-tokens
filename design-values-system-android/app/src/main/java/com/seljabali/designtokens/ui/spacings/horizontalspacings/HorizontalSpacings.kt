package com.seljabali.designtokens.ui.spacings.horizontalspacings

import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import com.seljabali.designtokens.R

enum class HorizontalSpacings(@DimenRes val spacingId: Int, @StringRes val stringId: Int) {
    XXS(R.dimen.xxs_horizontal_spacing_exp, R.string.xxs),
    XS(R.dimen.xs_horizontal_spacing_exp, R.string.xs),
    S(R.dimen.s_horizontal_spacing_exp, R.string.s),
    M(R.dimen.m_horizontal_spacing_exp, R.string.m),
    L(R.dimen.l_horizontal_spacing_exp, R.string.l),
    XL(R.dimen.xl_horizontal_spacing_exp, R.string.xl),
    XXL(R.dimen.xxl_horizontal_spacing_exp, R.string.xxl)
}