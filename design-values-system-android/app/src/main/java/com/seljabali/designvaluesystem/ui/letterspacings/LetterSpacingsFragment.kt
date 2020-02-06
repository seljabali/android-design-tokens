package com.seljabali.designvaluesystem.ui.letterspacings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_letter_spacings.*

class LetterSpacingsFragment : BaseFragment() {

    companion object {
        val TAG: String = LetterSpacingsFragment::class.java.simpleName
        fun newInstance() = LetterSpacingsFragment()
    }

    lateinit var letterSpacingsAdapter: LetterSpacingsAdapter

    override fun getToolbarTitle(): String = getString(R.string.letter_spacings)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_letter_spacings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letterSpacingsAdapter = LetterSpacingsAdapter()
        letterSpacingsAdapter.setLetterSpacings(LetterSpacings.values())
        letterSpacingsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = letterSpacingsAdapter
        }
    }

}