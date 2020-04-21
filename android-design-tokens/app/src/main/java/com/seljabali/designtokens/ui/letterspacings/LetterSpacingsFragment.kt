package com.seljabali.designtokens.ui.letterspacings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designtokens.R
import com.seljabali.designtokens.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_letter_spacings.*

class LetterSpacingsFragment : BaseFragment() {

    companion object {
        val TAG: String = LetterSpacingsFragment::class.java.simpleName
        fun newInstance() = LetterSpacingsFragment()
    }

    override fun getToolbarTitle(): String = getString(R.string.letter_spacings)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        R.layout.fragment_letter_spacings, container, false
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        letterSpacingsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = LetterSpacingsAdapter().apply {
                setLetterSpacings(LetterSpacings.values())
            }
        }
    }
}