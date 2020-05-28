package sondo65.com.lazada.views.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import sondo65.com.lazada.ImageLoader
import sondo65.com.lazada.R
import sondo65.com.lazada.views.main.adapters.ViewPagerAdapter
import sondo65.com.lazada.views.main.fragments.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    //var
    @Inject
    lateinit var imageLoader: ImageLoader;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpToolBar()

        initViewPager()
    }

     private fun setUpToolBar(){
        setTitle("")
        setSupportActionBar(toolbar)
    }

     private fun initViewPager(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentElectronic(),getString(R.string.fragment_text_electronic))
        adapter.addFragment(FragmentFashion(),getString(R.string.fragment_text_make_fashion))
        adapter.addFragment(FragmentHighlights(),getString(R.string.fragment_text_highlights))
        adapter.addFragment(FragmentHomeAndLife(),getString(R.string.fragment_text_home_and_life))
        adapter.addFragment(FragmentMakeBeauty(),getString(R.string.fragment_text_make_beauty))
        adapter.addFragment(FragmentMomAndBaby(),getString(R.string.fragment_text_mom_and_baby))
        adapter.addFragment(FragmentPromotions(),getString(R.string.fragment_text_promotions))
        adapter.addFragment(FragmentSportAndTravel(),getString(R.string.fragment_text_sport_and_travel))
        adapter.addFragment(FragmentTrademark(),getString(R.string.fragment_text_trademark))

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return true
    }
}
