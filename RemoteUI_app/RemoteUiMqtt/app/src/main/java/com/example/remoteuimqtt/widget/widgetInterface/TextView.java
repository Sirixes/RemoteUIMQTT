package com.example.remoteuimqtt.widget.widgetInterface;

import android.view.LayoutInflater;
import android.view.View;

import com.example.remoteuimqtt.elaborator.TreeElement;

public interface TextView {
    View createText(LayoutInflater layoutInflater, TreeElement treeElement);
}
