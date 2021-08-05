package com.example.remoteuimqtt.elaborator.Interface;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface ConnectionInterface {

    void connect(MqttAndroidClient client, Context context, LinearLayout layout);

}
