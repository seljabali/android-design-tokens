package com.seljabali.designvaluesystem.ui.spacings.horizontalspacings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_horizontal_spacings.*

class HorizontalSpacingsFragment : BaseFragment() {

    companion object {
        val TAG: String = HorizontalSpacingsFragment::class.java.simpleName
        fun newInstance() = HorizontalSpacingsFragment()
    }

    lateinit var horizontalSpacingsAdapter: HorizontalSpacingsAdapter

    override fun getToolbarTitle(): String = getString(R.string.horizontal_spacings)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_horizontal_spacings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        horizontalSpacingsAdapter = HorizontalSpacingsAdapter()
        horizontalSpacingsAdapter.setVerticalSpacings(HorizontalSpacings.values())
        horizontalSpacingsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = horizontalSpacingsAdapter
        }
    }

}