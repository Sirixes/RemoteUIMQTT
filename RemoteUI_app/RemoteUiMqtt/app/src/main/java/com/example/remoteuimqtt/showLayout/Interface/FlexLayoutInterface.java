package com.example.remoteuimqtt.showLayout.Interface;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.flexbox.FlexboxLayout;

public interface FlexLayoutInterface {
    void insertInLayout(LinearLayout linearLayout, FlexboxLayout flexboxLayout, View viewWidget, int flag);
}
