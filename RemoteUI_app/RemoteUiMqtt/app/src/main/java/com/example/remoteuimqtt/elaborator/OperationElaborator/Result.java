package com.example.remoteuimqtt.elaborator.OperationElaborator;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Result implements ResultInterface{
    @Override
    public void getResult(MqttAndroidClient client, LinearLayout layout, Context context) {
        client.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {

            }

            @Override
            public void messageArrived(String topic, MqttMessage message) throws Exception {
                if(topic.equals(Property.getProperty("result", context))){
                    TextView operationView = layout.findViewWithTag("Operation");
                    operationView.setText(new String(message.getPayload()));
                }else if(topic.equals(Property.getProperty("clockTime", context))){
                    TextView clockView = layout.findViewWithTag("clock");
                    clockView.setText(new String(message.getPayload()));
                }

            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });
    }
}
