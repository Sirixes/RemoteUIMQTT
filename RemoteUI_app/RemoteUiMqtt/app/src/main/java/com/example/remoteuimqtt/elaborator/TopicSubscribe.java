package com.example.remoteuimqtt.elaborator;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;

import lombok.SneakyThrows;


public class TopicSubscribe implements com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.TopicSubscribeInterface {

    @Override
    @SneakyThrows
    public void topicSubscribe(MqttAndroidClient client, Context context, LinearLayout layout) {
        client.subscribe(Property.getProperty("services", context), 1);
        new SynPublish().publish(client, context, layout);

    }
}