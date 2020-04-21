package com.seljabali.designtokens.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseActivity : AppCompatActivity(), FragmentManager.OnBackStackChangedListener {

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onPause() {
        super.onPause()
        compositeDisposable.clear()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
        // since onCreate doesn't register listener in subclasses we do it onResume
        // since onResume can occur more than once, we remove it in case it already exists
        supportFragmentManager.removeOnBackStackChangedListener(this)
        supportFragmentManager.addOnBackStackChangedListener(this)
    }

    override fun onBackStackChanged() {
        if (supportFragmentManager.fragments.isEmpty()) return
        val topFragment = supportFragmentManager.fragments.last() as? BaseFragment
        topFragment?.onVisible()
    }

    fun setToolbarTitle(title: String) {
        supportActionBar?.title = title
    }

    fun setToolbarSubtitle(subtitle: String) {
        supportActionBar?.subtitle = subtitle
    }

    fun showBackButton(show: Boolean) {
        supportActionBar?.setDisplayHomeAsUpEnabled(show)
    }

    protected fun subscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    protected fun clearSubscriptions() {
        compositeDisposable.clear()
    }

    protected fun findFragmentByTag(tag: String): BaseFragment? {
        var fragmentCandidate = supportFragmentManager.findFragmentByTag(tag) as? BaseFragment
        if (fragmentCandidate != null) return fragmentCandidate
        for (fragmentStack in supportFragmentManager.fragments) {
            fragmentCandidate = fragmentStack as BaseFragment
            if (fragmentCandidate.getDisplayTag() == tag) {
                return fragmentCandidate
            }
        }
        return null
    }

    private fun getTag(): String = javaClass.simpleName
}