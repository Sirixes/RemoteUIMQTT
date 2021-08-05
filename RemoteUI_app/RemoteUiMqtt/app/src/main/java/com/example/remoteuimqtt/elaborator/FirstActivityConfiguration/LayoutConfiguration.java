package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.CreateFromConfFile;
import com.google.android.flexbox.FlexboxLayout;

public class LayoutConfiguration implements LayoutConfigurationInterface{

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void layoutConf(LinearLayout layout, Context context, String confFile) {
        LayoutInflater inflater = LayoutInflater.from(context);
        //Configure FlexLayout
        View flexView = inflater.inflate(R.layout.flexbox_layout, null);
        FlexboxLayout flexboxLayout = flexView.findViewById(R.id.flex);
        //Configure LinearLayout
        View linearView = inflater.inflate(R.layout.linear_layout, null);
        LinearLayout linear = linearView.findViewById(R.id.linear);
        new CreateFromConfFile().createLayout(layout, context, confFile, linear, flexboxLayout);

    }
}
