package com.seljabali.designtokens.ui.landingpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seljabali.designtokens.R
import com.seljabali.designtokens.ui.BaseFragment
import com.seljabali.designtokens.ui.HomeActivity
import com.seljabali.designtokens.ui.LandingItem
import com.seljabali.designtokens.ui.colors.ColorsFragment
import com.seljabali.designtokens.ui.cornerradiuses.CornerRadiusFragment
import com.seljabali.designtokens.ui.letterspacings.LetterSpacingsFragment
import com.seljabali.designtokens.ui.spacings.showcasing.SpacingsShowCasingFragment
import com.seljabali.designtokens.ui.textappearances.textappearancesselector.TextSizeTypeFragment
import com.seljabali.designtokens.ui.transparency.TransparencyFragment
import kotlinx.android.synthetic.main.fragment_landing_page.*

class LandingPageFragment : BaseFragment() {

    companion object {
        val TAG: String = LandingPageFragment::class.java.simpleName
        fun newInstance(): LandingPageFragment =
            LandingPageFragment()
    }

    lateinit var adapter: LandingPageAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_landing_page, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = LandingPageAdapter {
            onPageItemClicked(it)
        }
        adapter.setLandingPageItems(LandingPageItems.values() as Array<LandingItem>)
        landingPageGridView.adapter = adapter
    }

    override fun onPause() {
        super.onPause()
        adapter.clearSubscriptions()
    }

    override fun onResume() {
        super.onResume()
        adapter.renewSubscriptions()
    }

    private fun onPageItemClicked(landingPageItem: LandingItem) {
        val homeActivity = baseActivity as HomeActivity
        when (landingPageItem) {
            LandingPageItems.SPACING -> homeActivity.showFragment(SpacingsShowCasingFragment.newInstance(), SpacingsShowCasingFragment.TAG)
            LandingPageItems.TEXT_SIZES -> homeActivity.showFragment(TextSizeTypeFragment.newInstance(), TextSizeTypeFragment.TAG)
            LandingPageItems.CORNER_RADIUS -> homeActivity.showFragment(CornerRadiusFragment.newInstance(), CornerRadiusFragment.TAG)
//            LandingPageItems.ELEVATIONS -> homeActivity.showFragment(ElevationsFragment.newInstance(), ElevationsFragment.TAG)
            LandingPageItems.LETTER_SPACINGS -> homeActivity.showFragment(LetterSpacingsFragment.newInstance(), LetterSpacingsFragment.TAG)
            LandingPageItems.COLORS -> homeActivity.showFragment(ColorsFragment.newInstance(), ColorsFragment.TAG)
            LandingPageItems.TRANSPARENCIES -> homeActivity.showFragment(TransparencyFragment.newInstance(), TransparencyFragment.TAG)
        }
        return
    }

}