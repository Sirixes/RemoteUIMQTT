package com.example.remoteuimqtt.elaborator;

import android.content.Context;
import android.widget.LinearLayout;

import com.google.android.flexbox.FlexboxLayout;

public interface CreateFromConfInterface {
    void createLayout(LinearLayout layout, Context context, String confFile, LinearLayout frame, FlexboxLayout flex);
}
