package com.seljabali.designvaluesystem.ui.spacings.padding

import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import com.seljabali.designvaluesystem.R

enum class Paddings(@DimenRes val spacingId: Int, @StringRes val stringId: Int) {
    XXS(R.dimen.xxs_padding_exp, R.string.xxs),
    XS(R.dimen.xs_padding_exp, R.string.xs),
    S(R.dimen.s_padding_exp, R.string.s),
    M(R.dimen.m_padding_exp, R.string.m),
    L(R.dimen.l_padding_exp, R.string.l),
    XL(R.dimen.xl_padding_exp, R.string.xl),
    XXL(R.dimen.xxl_padding_exp, R.string.xxl)
}