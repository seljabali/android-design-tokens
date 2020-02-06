package com.seljabali.designvaluesystem.ui.textsizes.appcompat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import com.seljabali.designvaluesystem.ui.textsizes.TextStyles
import com.seljabali.designvaluesystem.ui.textsizes.TextStylesAdapter
import kotlinx.android.synthetic.main.fragment_text_appearances.*

class AppCompatTextAppearancesFragment : BaseFragment() {

    companion object {
        val TAG: String = AppCompatTextAppearancesFragment::class.java.simpleName
        fun newInstance() = AppCompatTextAppearancesFragment()
    }

    override fun getToolbarTitle(): String = getString(R.string.app_compat_text_appearances)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_text_appearances, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textSizesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = TextStylesAdapter().apply {
                setTextStyles(AppCompatTextAppearances.values() as Array<TextStyles>)
            }
        }
    }

}