package com.example.remoteuimqtt.elaborator.OperationElaborator;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface TopicResultSubscribeInterface {
    void resultTopic(MqttAndroidClient client, Context context, LinearLayout layout);
}
