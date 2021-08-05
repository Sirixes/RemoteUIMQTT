package com.example.remoteuimqtt.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.TreeElement;

public class TextViewCreator implements com.example.remoteuimqtt.widget.widgetInterface.TextView {

    @Override
    public View createText(LayoutInflater layoutInflater, TreeElement treeElement){
        View textView = layoutInflater.inflate(R.layout.text_view_layout, null);
        TextView text = textView.findViewById(R.id.text_view);
        text.setTag(treeElement.getId());
        text.setText(treeElement.getText());
        return textView;
    }
}
