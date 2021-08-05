package com.example.remoteuimqtt.widget.button;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.remoteuimqtt.elaborator.DrawLayoutActivity;
import com.example.remoteuimqtt.elaborator.TreeElement;

public class ButtonNumberClick {
    public static void numberClick(Button button, TreeElement treeElement, LinearLayout mainLayout){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView operationView = mainLayout.findViewWithTag("Operation");
                DrawLayoutActivity.operation += (treeElement.getValue());
                operationView.setText(DrawLayoutActivity.operation);
            }
        });

    }
}
