package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttClient;

public interface CreateFirstActivityInterface {
    void createLayout(LinearLayout layout, Context context, String confFile, MqttAndroidClient client);
}
