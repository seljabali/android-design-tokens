package com.seljabali.designvaluesystem.ui.spacings.verticalspacings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment

class VerticalSpacingsFragment : BaseFragment() {

    companion object {
        val TAG: String = VerticalSpacingsFragment::class.java.simpleName
        fun newInstance() = VerticalSpacingsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_vertical_spacings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun getToolbarTitle(): String = getString(R.string.vertical_spacings)
}