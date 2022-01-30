package uz.pdp.viewpagerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import uz.pdp.viewpagerkotlin.fragments.FirstFragment
import uz.pdp.viewpagerkotlin.fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    lateinit var viewPagerAdapter: ViewPagerAdapters
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = ViewPagerAdapters(supportFragmentManager)
        viewPagerAdapter.add(FirstFragment(),"Page1")
        viewPagerAdapter.add(SecondFragment(),"Page2")
        viewPager.adapter = viewPagerAdapter
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}