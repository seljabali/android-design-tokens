package com.seljabali.designtokens.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseFragment : Fragment() {

    protected val baseActivity get() = activity as BaseActivity
    private val compositeDisposable = CompositeDisposable()

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {
        super.onPause()
        compositeDisposable.clear()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun getContext(): Context = activity as Context

    open fun onVisible() {
        val toolbarTitle = getToolbarTitle()
        if (toolbarTitle.isNotEmpty()) setToolbarTitle(toolbarTitle)
    }

    open fun getToolbarTitle(): String {
        // for subclasses to override
        return ""
    }

    fun getDisplayTag(): String = javaClass.simpleName

    protected fun setToolbarTitle(title: String) {
        baseActivity.setToolbarTitle(title)
    }

    protected fun setToolbarSubtitle(subtitle: String) {
        baseActivity.setToolbarSubtitle(subtitle)
    }

    protected fun subscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    protected fun clearSubscriptions() {
        compositeDisposable.clear()
    }
}