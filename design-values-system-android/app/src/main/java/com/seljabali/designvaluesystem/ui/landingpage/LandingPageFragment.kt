package com.seljabali.designvaluesystem.ui.landingpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import com.seljabali.designvaluesystem.ui.HomeActivity
import com.seljabali.designvaluesystem.ui.LandingItem
import com.seljabali.designvaluesystem.ui.cornerradiuses.CornerRadiusFragment
import com.seljabali.designvaluesystem.ui.spacings.showcasing.SpacingsShowCasingFragment
import com.seljabali.designvaluesystem.ui.textsizes.textsizeselector.TextSizeTypeFragment
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
        }
        return
    }

}