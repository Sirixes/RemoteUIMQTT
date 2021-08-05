package com.example.remoteuimqtt.widget.tabLayout;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import static com.example.remoteuimqtt.widget.tabLayout.tabInterface.AdapterSetterInterface.*;
import static com.example.remoteuimqtt.widget.tabLayout.tabInterface.ViewPagerViewCreator.createViewPager;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.TreeElement;
import com.google.android.material.tabs.TabLayout;

public class TabContentFiller implements com.example.remoteuimqtt.widget.widgetInterface.TabLayout {

    @Override
    @RequiresApi(api = Build.VERSION_CODES.N)
    public LinearLayout tabContentFiller(LayoutInflater layoutInflater, TreeElement treeElement, FragmentActivity fragmentActivity){
                TabLayout tabLayout = new TabLayoutViewCreator().createTabLayout(layoutInflater, treeElement);
                ViewPager2 viewPager = createViewPager(layoutInflater);
                setAdapter(tabLayout, viewPager, treeElement, fragmentActivity);
                View linearView = layoutInflater.inflate(R.layout.linear_layout, null);
                LinearLayout layoutTab = linearView.findViewById(R.id.linear);
                layoutTab.addView(tabLayout);
                layoutTab.addView(viewPager);
                return layoutTab;

    }
}
