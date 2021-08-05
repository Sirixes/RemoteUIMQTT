package com.example.remoteuimqtt.widget.tabLayout.tabInterface;

import android.os.Build;
import android.view.LayoutInflater;

import androidx.annotation.RequiresApi;

import com.example.remoteuimqtt.elaborator.TreeElement;
import com.google.android.material.tabs.TabLayout;

public interface TabCreator {
    @RequiresApi(api = Build.VERSION_CODES.N)
    TabLayout createTabLayout(LayoutInflater layoutInflater, TreeElement treeElement);
}
