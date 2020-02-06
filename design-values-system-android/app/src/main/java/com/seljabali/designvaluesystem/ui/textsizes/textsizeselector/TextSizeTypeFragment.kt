package com.seljabali.designvaluesystem.ui.textsizes.textsizeselector

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import com.seljabali.designvaluesystem.ui.HomeActivity
import com.seljabali.designvaluesystem.ui.LandingItem
import com.seljabali.designvaluesystem.ui.textsizes.appcompat.AppCompatTextAppearancesFragment
import com.seljabali.designvaluesystem.ui.textsizes.material.MaterialTextAppearancesFragment
import kotlinx.android.synthetic.main.fragment_text_size_types_landing_page.*

class TextSizeTypeFragment : BaseFragment() {

    companion object {
        val TAG: String = TextSizeTypeFragment::class.java.simpleName
        fun newInstance() = TextSizeTypeFragment()
    }

    lateinit var adapter: TextSizeTypeAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_text_size_types_landing_page, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TextSizeTypeAdapter {
            onPageItemClicked(it)
        }
        adapter.setLandingPageItems(TextSizeTypeLandingItem.values() as Array<LandingItem>)
        textSizeTypesGridView.adapter = adapter
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
            TextSizeTypeLandingItem.APP_COMPAT -> homeActivity.showFragment(AppCompatTextAppearancesFragment.newInstance(), AppCompatTextAppearancesFragment.TAG)
            TextSizeTypeLandingItem.MATERIAL -> homeActivity.showFragment(MaterialTextAppearancesFragment.newInstance(), MaterialTextAppearancesFragment.TAG)
//            TextSizeTypeLandingItem.CUSTOM -> { }
        }
        return
    }

}