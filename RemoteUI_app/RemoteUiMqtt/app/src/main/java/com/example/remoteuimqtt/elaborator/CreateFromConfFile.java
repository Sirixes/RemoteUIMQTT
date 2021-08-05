package com.example.remoteuimqtt.elaborator;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.showLayout.InsertElement;
import com.example.remoteuimqtt.showLayout.ViewWidgetFactory;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class CreateFromConfFile implements  CreateFromConfInterface{
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void createLayout(LinearLayout mainLayout, Context context, String confFile, LinearLayout frame, FlexboxLayout flex) {
        Gson gson = new Gson();
        Activity activity = (Activity) context;

        Type itemTreeListType = new TypeToken<List<TreeElement>>(){}.getType();
        List<TreeElement> childrenItem = gson.fromJson(confFile, itemTreeListType);
        if(childrenItem != null){
            for (TreeElement treeElement : childrenItem) {
                View viewWidget = new ViewWidgetFactory().buildWidget((FragmentActivity) activity, mainLayout.getContext(), treeElement, mainLayout);
                new InsertElement().insertInLayout(frame, flex, viewWidget, treeElement.getFlag());
            }

            mainLayout.addView(frame);
            mainLayout.addView(flex);

        }
    }
}
