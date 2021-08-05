package com.example.remoteuimqtt.elaborator.OperationElaborator.NewConnection;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;

public class NewClient implements NewClientInterface{
    @Override
    public void newClient(LinearLayout layout, Context context, Button button) {
        String clientId = org.eclipse.paho.client.mqttv3.MqttClient.generateClientId();
        MqttAndroidClient client = new MqttAndroidClient(context.getApplicationContext(), Property.getProperty("serverURI", context),
                clientId);
        new NewConnection().newConnection(client, context, layout, button);
    }
}
