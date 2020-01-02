package com.seljabali.designvaluesystem.ui

import android.os.Bundle
import com.google.android.material.appbar.AppBarLayout
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.landingpage.LandingPageFragment

class HomeActivity : BaseActivity() {

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupToolbar()
        showLandingPage()
    }

    override fun onBackStackChanged() {
        super.onBackStackChanged()
        val supportActionBar = supportActionBar ?: return
        val isAtHomePage: Boolean = supportFragmentManager.backStackEntryCount < 1
        supportActionBar.setDisplayHomeAsUpEnabled(!isAtHomePage)
        if (isAtHomePage) {
            setToolBarTitle(getString(R.string.app_name))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        super.onSupportNavigateUp()
        onBackPressed()
        return true
    }

    fun showFragment(baseFragment: androidx.fragment.app.Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.enter_from_right,
                R.anim.exit_to_left,
                R.anim.enter_from_left,
                R.anim.exit_to_right
            )
            .add(R.id.frameLayout, baseFragment)
            .addToBackStack(tag)
            .commit()
    }

    fun setToolBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun setupToolbar() {
        val appBar = findViewById<AppBarLayout>(R.id.appToolbar)
        toolbar = appBar.findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        showBackButton(false)
    }

    private fun showLandingPage() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, LandingPageFragment.newInstance())
            .commit()
    }
}
