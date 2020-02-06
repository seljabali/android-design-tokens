package com.seljabali.designvaluesystem.ui.elevations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_elevations.*

class ElevationsFragment : BaseFragment() {

    companion object {
        val TAG: String = ElevationsFragment::class.java.simpleName
        fun newInstance() = ElevationsFragment()
    }

    lateinit var elevationsAdapter: ElevationsAdapter

    override fun getToolbarTitle(): String = getString(R.string.elevations)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_elevations, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        elevationsAdapter = ElevationsAdapter()
        elevationsAdapter.setElevations(Elevations.values())
        elevationsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = elevationsAdapter
        }
    }

}