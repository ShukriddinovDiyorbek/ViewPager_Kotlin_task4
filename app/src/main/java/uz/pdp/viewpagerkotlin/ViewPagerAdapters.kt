package uz.pdp.viewpagerkotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapters(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments: ArrayList<Fragment> = ArrayList()
    private val fragmentsTitle: ArrayList<String> = ArrayList()
    public fun add(fragment: Fragment?, title: String?) {
        if (fragment != null) {
            fragments.add(fragment)
        }
        if (title != null) {
            fragmentsTitle.add(title)
        }
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentsTitle.get(position)
    }
}