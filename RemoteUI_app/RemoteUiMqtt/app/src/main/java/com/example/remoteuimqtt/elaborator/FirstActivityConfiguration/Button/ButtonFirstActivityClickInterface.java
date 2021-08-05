package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.Button;

import android.content.Context;
import android.widget.Button;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttClient;

public interface ButtonFirstActivityClickInterface {
    void click (Button button, String topic, MqttAndroidClient client, Context context);
}
