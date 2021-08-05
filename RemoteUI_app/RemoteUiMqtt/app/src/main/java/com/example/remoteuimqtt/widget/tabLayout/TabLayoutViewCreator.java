package com.example.remoteuimqtt.widget.tabLayout;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.RequiresApi;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.widget.tabLayout.tabInterface.TabCreator;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutViewCreator implements TabCreator {

    @Override
    @RequiresApi(api = Build.VERSION_CODES.N)
    public TabLayout createTabLayout(LayoutInflater layoutInflater, TreeElement treeElement){
        //ViewGroup to insert multiple elements in the tab
        View tabView = layoutInflater.inflate(R.layout.tab_layout, null);
        TabLayout tabLayout = tabView.findViewById(R.id.TabLayout);
        tabLayout.setTag(treeElement.getId());
        treeElement.getTreeElementChildren().forEach(tabItem -> {
            tabLayout.addTab(tabLayout.newTab().setText(tabItem.getText()));
        });
        return tabLayout;
    }
}
