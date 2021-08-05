package com.example.remoteuimqtt.elaborator.clock;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.remoteuimqtt.elaborator.DrawLayoutActivity;
import com.example.remoteuimqtt.elaborator.Interface.Property;
import com.example.remoteuimqtt.elaborator.OperationElaborator.TopicResultSubscribe;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import lombok.SneakyThrows;

public class OnOffPublish implements OffInterface, OnInterface{
    MqttAndroidClient client;
    Context context;
    LinearLayout layout;

    public OnOffPublish(MqttAndroidClient client, Context context, LinearLayout layout){
        this.client = client;
        this.context = context;
        this.layout = layout;
    }


    @Override
    @SneakyThrows
    public void sendOff() {
        byte[] payload = ("off").getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        client.publish(Property.getProperty("onOff", context),msg);
        TextView operationView = layout.findViewWithTag("clock");
        String testo = "Clicca il tasto per richiedere l'ora";
        operationView.setText(testo);
    }

    @Override
    @SneakyThrows
    public void sendOn() {
        byte[] payload = ("on").getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        client.publish(Property.getProperty("onOff", context),msg);
        new SubscribeTimeTopic().subscribe(client, context, layout);

    }
}
