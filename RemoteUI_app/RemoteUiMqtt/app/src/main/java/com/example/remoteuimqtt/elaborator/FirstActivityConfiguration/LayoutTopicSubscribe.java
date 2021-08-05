package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.example.remoteuimqtt.elaborator.ClientCallback;
import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;

import lombok.SneakyThrows;

public class LayoutTopicSubscribe implements LayoutTopicSubscribeInterface{
    @Override
    @SneakyThrows
    public void topicSubscribe(MqttAndroidClient client, Context context, String topic) {
        client.subscribe(topic, 1);
        Log.d("Subscribe: ", "topicSubscribe: " + client.isConnected());
        new ClientCallback().clientCallback(client, context);
    }
}
