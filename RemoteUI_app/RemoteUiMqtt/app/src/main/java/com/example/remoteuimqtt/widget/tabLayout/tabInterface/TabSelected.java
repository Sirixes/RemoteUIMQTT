package com.example.remoteuimqtt.widget.tabLayout.tabInterface;

import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public interface TabSelected {
    static void onTabSelectedListner(TabLayout tabLayout, ViewPager2 viewPager) {
        //We use this for some actions when we click or we change tab item
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //With this we set the action on the click of the item
                //with the same of the swipe
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
