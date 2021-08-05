package com.example.remoteuimqtt.showLayout.Interface;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.elaborator.TreeElement;

public interface ViewWidgetFactoryInterface {
    @RequiresApi(api = Build.VERSION_CODES.N)
    View buildWidget(FragmentActivity fragmentActivity, Context mainContext, TreeElement treeElement, LinearLayout mainLayout);
}
