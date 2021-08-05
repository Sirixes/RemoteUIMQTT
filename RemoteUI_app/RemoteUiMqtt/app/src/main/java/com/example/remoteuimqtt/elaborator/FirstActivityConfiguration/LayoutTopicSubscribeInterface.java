package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.content.Context;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface LayoutTopicSubscribeInterface {

    void topicSubscribe(MqttAndroidClient client, Context context, String topic);
}
