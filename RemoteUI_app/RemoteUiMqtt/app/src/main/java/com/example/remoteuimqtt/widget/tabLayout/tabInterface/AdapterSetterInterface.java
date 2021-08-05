package com.example.remoteuimqtt.widget.tabLayout.tabInterface;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.widget.tabLayout.TabAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.concurrent.atomic.AtomicInteger;


public interface AdapterSetterInterface {
    @RequiresApi(api = Build.VERSION_CODES.N)
    static void setAdapter(TabLayout tabLayout, ViewPager2 viewPager, TreeElement treeElement, FragmentActivity fragmentActivity) {
        AtomicInteger k = new AtomicInteger();
        //We use the adapter for insert the content in the right position
        TabAdapter tabAdapter = new TabAdapter(fragmentActivity, tabLayout.getTabCount());
        viewPager.setAdapter(tabAdapter);
        treeElement.getTreeElementChildren().forEach(tabContent -> {
            tabAdapter.addTabChildren(tabContent.getTreeElementChildren(), k.getAndIncrement());
        });
        TabSelected.onTabSelectedListner(tabLayout, viewPager);

    }
}
