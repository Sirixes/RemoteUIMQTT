package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.Button;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.ConfigurationElement;

import org.eclipse.paho.android.service.MqttAndroidClient;


public class ButtonFirstActivityView implements ButtonFirstActivityInterface{
    @Override
    public View createButton(LayoutInflater inflater, ConfigurationElement configurationElement, MqttAndroidClient client, Context context) {
        View buttonView = inflater.inflate(R.layout.button_layout, null);
        Button button = buttonView.findViewById(R.id.button);
        button.setTag(configurationElement.getId());
        button.setText(configurationElement.getLabel());
        new ButtonFirstActivityClick().click(button, configurationElement.getTopic(), client, context);
        return buttonView;
    }
}
