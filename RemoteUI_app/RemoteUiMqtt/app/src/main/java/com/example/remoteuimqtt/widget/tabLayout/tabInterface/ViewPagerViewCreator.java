package com.example.remoteuimqtt.widget.tabLayout.tabInterface;

import android.view.LayoutInflater;
import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

import com.example.remoteuimqtt.R;

public interface ViewPagerViewCreator {
    static ViewPager2 createViewPager(LayoutInflater layoutInflater) {
        View viewPagerView = layoutInflater.inflate(R.layout.view_pager_layout, null);
        return viewPagerView.findViewById(R.id.viewPagerLayout);
    }
}
