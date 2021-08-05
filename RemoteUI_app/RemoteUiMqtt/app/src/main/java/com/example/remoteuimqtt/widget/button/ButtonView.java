package com.example.remoteuimqtt.widget.button;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.TreeElement;

public interface ButtonView {
    View createButton(LayoutInflater layoutInflater, TreeElement treeElement, LinearLayout mainLayout, Context main);
}
