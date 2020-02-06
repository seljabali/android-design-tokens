package com.seljabali.designvaluesystem.ui.cornerradiuses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_corner_radiuses.*

class CornerRadiusFragment : BaseFragment() {

    companion object {
        val TAG: String = CornerRadiusFragment::class.java.simpleName
        fun newInstance() = CornerRadiusFragment()
    }

    lateinit var cornerRadiusAdapter: CornerRadiusAdapter

    override fun getToolbarTitle(): String = getString(R.string.corner_radiuses)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_corner_radiuses, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cornerRadiusAdapter = CornerRadiusAdapter()
        cornerRadiusAdapter.setCornerRadiuses(CornerRadiuses.values())
        cornerRadiusesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = cornerRadiusAdapter
        }
    }

}