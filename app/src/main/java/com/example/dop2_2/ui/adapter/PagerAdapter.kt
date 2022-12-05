package com.example.dop2_2.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dop2_2.ui.fragments.FirstFragment
import com.example.dop2_2.ui.fragments.MainFragment
import com.example.dop2_2.ui.fragments.SecondFragment

class PagerAdapter(fragmentActivity: MainFragment): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }
}