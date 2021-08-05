package com.example.remoteuimqtt.widget.button;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.TreeElement;

public interface ToggleInterface {
    void toggleClick(Button button, TreeElement treeElement, LinearLayout mainLayout, Context context);
}
