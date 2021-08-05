package com.example.remoteuimqtt.widget.widgetInterface;

import android.os.Build;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.elaborator.TreeElement;

public interface TabLayout {
    @RequiresApi(api = Build.VERSION_CODES.N)
    LinearLayout tabContentFiller(LayoutInflater layoutInflater, TreeElement treeElement, FragmentActivity fragmentActivity);
}
