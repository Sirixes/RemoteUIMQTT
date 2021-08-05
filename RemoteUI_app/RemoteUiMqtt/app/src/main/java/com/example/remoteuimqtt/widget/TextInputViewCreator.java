package com.example.remoteuimqtt.widget;

import android.view.LayoutInflater;
import android.view.View;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.widget.widgetInterface.TextInputView;
import com.google.android.material.textfield.TextInputLayout;

public class TextInputViewCreator implements TextInputView {

    @Override
    public View textInputCreator(LayoutInflater layoutInflater, TreeElement treeElement){
        View textInputView = layoutInflater.inflate(R.layout.text_input_layout, null);
        TextInputLayout textInputLayout = textInputView.findViewById(R.id.textInputLayout);
        textInputLayout.setTag(treeElement.getId());
        textInputLayout.setHint(treeElement.getText());
        return textInputView;
    }
}
