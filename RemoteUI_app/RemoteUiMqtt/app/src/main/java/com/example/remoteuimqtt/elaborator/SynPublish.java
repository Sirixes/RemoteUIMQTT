package com.example.remoteuimqtt.elaborator;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.Interface.Property;
import com.example.remoteuimqtt.elaborator.OperationElaborator.TopicResultSubscribe;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import lombok.SneakyThrows;

public class SynPublish implements SynPublishInterface{
    @Override
    @SneakyThrows
    public void publish(MqttAndroidClient client, Context context, LinearLayout layout) {
        byte[] payload = ("syn").getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        client.publish(Property.getProperty("syn", context),msg);
        new ClientCallback(layout).clientCallback(client, context);

    }
}
