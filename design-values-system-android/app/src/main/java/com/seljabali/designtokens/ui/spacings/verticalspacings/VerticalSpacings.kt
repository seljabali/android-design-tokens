package com.seljabali.designtokens.ui.spacings.verticalspacings

import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import com.seljabali.designtokens.R

// Linear
//enum class VerticalSpacings(@DimenRes val spacingId: Int, @StringRes val stringId: Int) {
//    XXS(R.dimen.xxs_vertical_spacing, R.string.xxs),
//    XS(R.dimen.xs_vertical_spacing, R.string.xs),
//    S(R.dimen.s_vertical_spacing, R.string.s),
//    M(R.dimen.m_vertical_spacing, R.string.m),
//    L(R.dimen.l_vertical_spacing, R.string.l),
//    XL(R.dimen.xl_vertical_spacing, R.string.xl),
//    XXL(R.dimen.xxl_vertical_spacing, R.string.xxl),
//    XXXL(R.dimen.xxxl_vertical_spacing, R.string.xxxl),
//    XL4(R.dimen.xl4_vertical_spacing, R.string.xl4)
//}

// Exponential
enum class VerticalSpacings(@DimenRes val spacingId: Int, @StringRes val stringId: Int) {
    XXS(R.dimen.xxs_vertical_spacing_exp, R.string.xxs),
    XS(R.dimen.xs_vertical_spacing_exp, R.string.xs),
    S(R.dimen.s_vertical_spacing_exp, R.string.s),
    M(R.dimen.m_vertical_spacing_exp, R.string.m),
    L(R.dimen.l_vertical_spacing_exp, R.string.l),
    XL(R.dimen.xl_vertical_spacing_exp, R.string.xl),
    XXL(R.dimen.xxl_vertical_spacing_exp, R.string.xxl)
}