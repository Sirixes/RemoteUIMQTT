package com.example.remoteuimqtt.elaborator.OperationElaborator;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.DrawLayoutActivity;
import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import lombok.SneakyThrows;

public class PublishToTopic implements TopicMinusInterface, TopicPlusInterface{

    MqttAndroidClient client;
    Context context;
    LinearLayout layout;

    public PublishToTopic(MqttAndroidClient client, Context context, LinearLayout layout){
        this.client = client;
        this.context = context;
        this.layout = layout;
    }

    @Override
    @SneakyThrows
    public void publishToMinusTopic() {
        byte[] payload = (DrawLayoutActivity.operation).getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        client.publish(Property.getProperty("operationMinus", context),msg);
        DrawLayoutActivity.operation = "";
        new TopicResultSubscribe().resultTopic(client, context, layout);
    }

    @Override
    @SneakyThrows
    public void publishToPlusTopic() {
        byte[] payload = (DrawLayoutActivity.operation).getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        client.publish(Property.getProperty("operationPlus", context),msg);
        DrawLayoutActivity.operation = "";
        new TopicResultSubscribe().resultTopic(client, context, layout);

    }
}
