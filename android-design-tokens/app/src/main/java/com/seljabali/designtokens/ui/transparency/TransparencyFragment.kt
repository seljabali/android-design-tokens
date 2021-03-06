package com.seljabali.designtokens.ui.transparency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designtokens.R
import com.seljabali.designtokens.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_transparencies.*

class TransparencyFragment : BaseFragment() {

    companion object {
        val TAG: String = TransparencyFragment::class.java.simpleName
        fun newInstance() = TransparencyFragment()
    }

    override fun getToolbarTitle(): String = getString(R.string.transparencies)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        R.layout.fragment_transparencies, container, false
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        transparenciesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = TransparencyAdapter().apply {
                setTransparencies(Transparencies.values())
            }
        }
    }

}