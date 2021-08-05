package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.content.Context;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface TopicSubscribeInterface {
    void topicSubscribe(MqttAndroidClient client, Context context, LinearLayout layout);

}
