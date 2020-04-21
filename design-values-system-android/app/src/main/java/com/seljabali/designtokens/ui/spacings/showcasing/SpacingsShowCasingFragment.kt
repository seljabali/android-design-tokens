package com.seljabali.designtokens.ui.spacings.showcasing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seljabali.designtokens.R
import com.seljabali.designtokens.ui.BaseFragment
import com.seljabali.designtokens.ui.HomeActivity
import com.seljabali.designtokens.ui.LandingItem
import com.seljabali.designtokens.ui.landingpage.LandingPageAdapter
import com.seljabali.designtokens.ui.spacings.horizontalspacings.HorizontalSpacingsFragment
import com.seljabali.designtokens.ui.spacings.padding.PaddingsFragment
import com.seljabali.designtokens.ui.spacings.verticalspacings.VerticalSpacingsFragment
import kotlinx.android.synthetic.main.fragment_spacings_showcasing_landing_page.*

class SpacingsShowCasingFragment: BaseFragment() {

    companion object {
        val TAG: String = SpacingsShowCasingFragment::class.java.simpleName
        fun newInstance() = SpacingsShowCasingFragment()
    }

    lateinit var adapter: LandingPageAdapter

    override fun getToolbarTitle(): String = getString(R.string.spacings)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_spacings_showcasing_landing_page, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = LandingPageAdapter {
            onPageItemClicked(it)
        }
        adapter.setLandingPageItems(SpacingsShowCasingItems.values() as Array<LandingItem>)
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
            SpacingsShowCasingItems.HORIZONTAL -> homeActivity.showFragment(HorizontalSpacingsFragment.newInstance(), HorizontalSpacingsFragment.TAG)
            SpacingsShowCasingItems.VERTICAL -> homeActivity.showFragment(VerticalSpacingsFragment.newInstance(), VerticalSpacingsFragment.TAG)
            SpacingsShowCasingItems.PADDING -> homeActivity.showFragment(PaddingsFragment.newInstance(), PaddingsFragment.TAG)
        }
        return
    }

}