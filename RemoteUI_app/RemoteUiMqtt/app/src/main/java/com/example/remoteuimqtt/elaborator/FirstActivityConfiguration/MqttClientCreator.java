package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.ClientConnection;
import com.example.remoteuimqtt.elaborator.Interface.MqttClientCreatorInterface;
import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;

import lombok.SneakyThrows;

public class MqttClientCreator implements MqttClientCreatorInterface {
    @Override
    @SneakyThrows
    public void createClient(LinearLayout layout, Context context) {
        String clientId = org.eclipse.paho.client.mqttv3.MqttClient.generateClientId();
        MqttAndroidClient client = new MqttAndroidClient(context.getApplicationContext(), Property.getProperty("serverURI", context),
                clientId);
        new ClientConnection().connect(client, context, layout);
    }

}
