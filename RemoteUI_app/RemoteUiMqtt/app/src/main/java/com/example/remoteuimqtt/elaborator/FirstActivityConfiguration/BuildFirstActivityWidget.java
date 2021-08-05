package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.Button.ButtonFirstActivityView;

import org.eclipse.paho.android.service.MqttAndroidClient;


public class BuildFirstActivityWidget implements BuildFirstActivityWidgetInterface{
    @Override
    public View buildWidget(FragmentActivity activity, Context firstActivityContext, ConfigurationElement element, MqttAndroidClient client) {
        LayoutInflater inflater = LayoutInflater.from(firstActivityContext);
        return new ButtonFirstActivityView().createButton(inflater, element, client, firstActivityContext);
    }

}

