package com.example.remoteuimqtt.elaborator.clock;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface ToggleStatusInterface {

    void getStatus(MqttAndroidClient client, Context context, LinearLayout layout);
}
