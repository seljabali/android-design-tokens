package com.seljabali.designvaluesystem.ui.spacings.padding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_paddings.*

class PaddingsFragment : BaseFragment() {

    companion object {
        val TAG: String = PaddingsFragment::class.java.simpleName
        fun newInstance() = PaddingsFragment()
    }

    private lateinit var paddingsAdapter: PaddingsAdapter

    override fun getToolbarTitle(): String = getString(R.string.paddings)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_paddings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        paddingsAdapter = PaddingsAdapter()
        paddingsAdapter.setPaddings(Paddings.values())
        paddingsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = paddingsAdapter
        }
    }

}