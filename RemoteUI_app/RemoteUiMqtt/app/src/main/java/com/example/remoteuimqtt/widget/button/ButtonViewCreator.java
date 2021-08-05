package com.example.remoteuimqtt.widget.button;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.R;

import static com.example.remoteuimqtt.widget.button.ButtonNumberClick.numberClick;

public class ButtonViewCreator implements ButtonView {

    @Override
    public View createButton(LayoutInflater layoutInflater, TreeElement treeElement, LinearLayout mainLayout, Context main){
        View buttonView = layoutInflater.inflate(R.layout.button_layout, null);
        Button button = buttonView.findViewById(R.id.button);
        button.setTag(treeElement.getId());
        button.setText(treeElement.getText());
        if(treeElement.getId().equals("=")){
            EqualClick.equalClick(button, treeElement, mainLayout, main);
        }
        else if(treeElement.getId().equals("toggle")){
            new Toggle().toggleClick(button, treeElement, mainLayout, main);
        }
        else{
            ButtonNumberClick.numberClick(button, treeElement, mainLayout);
        }
        return buttonView;
    }

}
