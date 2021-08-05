package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.R;

public class ViewSetup {

    public LinearLayout viewSetup(ConfigurationElement configurationElement, Context context){
        LayoutInflater inflater = LayoutInflater.from(context);
        View linearView = inflater.inflate(R.layout.linear_layout, null);
        LinearLayout partialLayout = linearView.findViewById(R.id.linear);
        partialLayout.setOrientation(LinearLayout.HORIZONTAL);
        return partialLayout;
    }
}
