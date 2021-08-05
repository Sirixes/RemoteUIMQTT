package com.example.remoteuimqtt.widget.button;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.remoteuimqtt.elaborator.OperationElaborator.NewConnection.NewClient;
import com.example.remoteuimqtt.elaborator.TreeElement;

public class Toggle implements ToggleInterface{
    @Override
    public void toggleClick(Button button, TreeElement treeElement, LinearLayout mainLayout, Context context) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    new NewClient().newClient(mainLayout, context, button);
            }
        });
    }
}
