package com.example.dop2_2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.dop2_2.R
import com.example.dop2_2.databinding.FragmentMainBinding
import com.example.dop2_2.ui.adapter.PagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.pager.adapter = PagerAdapter(this)
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_arrow_forward_ios_24)
                    tab.icon?.setTint(ContextCompat.getColor(requireContext(), R.color.white))
                }
                1 ->{
                    tab.setIcon(R.drawable.ic_baseline_arrow_back_ios_24)
                    tab.icon?.setTint(ContextCompat.getColor(requireContext(), R.color.white))
                }
            }
        }.attach()
    }
}