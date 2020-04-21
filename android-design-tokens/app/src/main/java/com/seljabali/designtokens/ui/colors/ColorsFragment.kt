package com.seljabali.designtokens.ui.colors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designtokens.R
import com.seljabali.designtokens.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_colors.*

class ColorsFragment : BaseFragment() {

    companion object {
        val TAG: String = ColorsFragment::class.java.simpleName
        fun newInstance() = ColorsFragment()
    }

    override fun getToolbarTitle(): String = getString(R.string.colors)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        R.layout.fragment_colors, container, false
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        colorsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = ColorsAdapter().apply {
                setColors(Colors.values())
            }
        }
    }
}