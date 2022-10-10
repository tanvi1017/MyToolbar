package com.tanvi.mytoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.tanvi.mytoolbar.databinding.ActivityMainBinding

val animalsArray = arrayOf(
    "raVI",
    "KAALU",
    "Menu"
)

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // delare

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = animalsArray[position] //0 /
        }.attach()
    }
}


