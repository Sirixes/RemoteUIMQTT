package com.example.remoteuimqtt.elaborator;

import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.Interface.ConnectionInterface;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

import lombok.SneakyThrows;

public class ClientConnection implements ConnectionInterface {
    @Override
    @SneakyThrows
    public void connect(MqttAndroidClient client, Context context, LinearLayout layout) {
        IMqttToken token = client.connect();
        token.setActionCallback(new IMqttActionListener() {
            @Override
            public void onSuccess(IMqttToken asyncActionToken) {
                new TopicSubscribe().topicSubscribe(client, context, layout);
            }

            @Override
            public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                // Something went wrong e.g. connection timeout or firewall problems
                Log.d("Connection", "Failed");
            }
        });

    }
}
