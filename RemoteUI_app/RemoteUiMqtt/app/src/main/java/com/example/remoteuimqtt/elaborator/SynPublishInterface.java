package com.example.remoteuimqtt.elaborator;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface SynPublishInterface {
    void publish(MqttAndroidClient client, Context context, LinearLayout layout);
}
