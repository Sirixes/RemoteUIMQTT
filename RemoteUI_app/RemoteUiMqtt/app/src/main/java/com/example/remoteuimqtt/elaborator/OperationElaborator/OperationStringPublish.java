package com.example.remoteuimqtt.elaborator.OperationElaborator;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.DrawLayoutActivity;
import com.example.remoteuimqtt.elaborator.Interface.Property;
import com.example.remoteuimqtt.elaborator.MainActivity;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import lombok.SneakyThrows;

public class OperationStringPublish implements OperationStringPublishInterface{
    @Override
    @SneakyThrows
    public void publishString(MqttAndroidClient client, Context context, LinearLayout layout) {
        if(MainActivity.topic.equals(Property.getProperty("layoutPlus", context))){
            new PublishToTopic(client, context, layout).publishToPlusTopic();
        }
        else if(MainActivity.topic.equals(Property.getProperty("layoutMinus", context))){
            new PublishToTopic(client, context, layout).publishToMinusTopic();
        }

    }
}
