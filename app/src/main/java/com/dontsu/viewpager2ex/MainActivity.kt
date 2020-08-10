package com.dontsu.viewpager2ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = arrayListOf(
            R.drawable.dog1,
            R.drawable.dog2,
            R.drawable.dog3,
            R.drawable.dog4,
            R.drawable.dog5
        )

        viewPager.apply {
            adapter = ViewPagerAdapter(images)
        }

    }

}
