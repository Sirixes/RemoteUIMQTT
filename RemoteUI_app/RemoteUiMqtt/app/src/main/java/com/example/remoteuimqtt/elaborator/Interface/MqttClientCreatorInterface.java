package com.example.remoteuimqtt.elaborator.Interface;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface MqttClientCreatorInterface {

    void createClient(LinearLayout layout, Context context);

}
