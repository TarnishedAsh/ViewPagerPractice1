package com.example.viewpagerpractice1.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.viewpagerpractice1.fragments.BirthYearFragment
import com.example.viewpagerpractice1.fragments.HelloFragment
import com.example.viewpagerpractice1.fragments.NameFragment

class MainViewPagerAdapter( fm : FragmentManager) : ViewpagerAdapter(fm) {
    override fun getCount() = 3

    override  fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            2 -> HelloFragment()
        }
    }
override fun getPageTitle
}