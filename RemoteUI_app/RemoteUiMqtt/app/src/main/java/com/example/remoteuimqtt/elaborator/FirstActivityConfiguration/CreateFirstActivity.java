package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.eclipse.paho.android.service.MqttAndroidClient;

import java.lang.reflect.Type;
import java.util.List;

public class CreateFirstActivity implements CreateFirstActivityInterface{
    @Override
    public void createLayout(LinearLayout layout, Context context, String confFile, MqttAndroidClient client) {
        Gson gson = new Gson();
        Activity activity = (Activity) context;
        layout.invalidate();
        Type configurationElementType = new TypeToken<List<ConfigurationElement>>(){}.getType();
        List<ConfigurationElement> elements = gson.fromJson(confFile, configurationElementType);
        if(elements != null){
            for (ConfigurationElement configurationElement: elements) {
                View viewWidget = new BuildFirstActivityWidget().
                        buildWidget((FragmentActivity) activity, layout.getContext(), configurationElement, client);
                layout.addView(viewWidget);
            }
        }
    }
}
