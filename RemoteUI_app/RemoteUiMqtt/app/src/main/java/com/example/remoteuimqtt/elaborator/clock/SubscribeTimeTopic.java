package com.example.remoteuimqtt.elaborator.clock;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.Interface.Property;
import com.example.remoteuimqtt.elaborator.OperationElaborator.Result;

import org.eclipse.paho.android.service.MqttAndroidClient;

import lombok.SneakyThrows;

public class SubscribeTimeTopic implements TopicLiveTimeInterface{
    @Override
    @SneakyThrows
    public void subscribe(MqttAndroidClient client, Context context, LinearLayout layout) {
        client.subscribe(Property.getProperty("clockTime", context), 1);
        new Result().getResult(client, layout, context);
    }
}
