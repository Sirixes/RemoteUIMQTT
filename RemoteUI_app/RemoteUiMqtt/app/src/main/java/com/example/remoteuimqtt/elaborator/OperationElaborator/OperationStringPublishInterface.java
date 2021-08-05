package com.example.remoteuimqtt.elaborator.OperationElaborator;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface OperationStringPublishInterface {

    void publishString(MqttAndroidClient client, Context context, LinearLayout layout);
}
