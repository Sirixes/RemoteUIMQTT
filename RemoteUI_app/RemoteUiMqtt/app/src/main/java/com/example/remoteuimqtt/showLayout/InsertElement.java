package com.example.remoteuimqtt.showLayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.showLayout.Interface.FlexLayoutInterface;
import com.google.android.flexbox.FlexboxLayout;

public class InsertElement implements FlexLayoutInterface {
    @Override
    public void insertInLayout(LinearLayout linearLayout, FlexboxLayout flexboxLayout, View viewWidget, int flag) {

        if(flag == 0){
            flexboxLayout.addView(viewWidget);
        }
        if(flag == 1){
            linearLayout.addView(viewWidget);
        }
    }
}
