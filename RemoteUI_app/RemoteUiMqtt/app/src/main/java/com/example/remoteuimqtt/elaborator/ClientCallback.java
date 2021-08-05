package com.example.remoteuimqtt.elaborator;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.CreateFirstActivity;
import com.example.remoteuimqtt.elaborator.Interface.ClientMqttCallbackInterface;
import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class ClientCallback implements ClientMqttCallbackInterface {

    LinearLayout layout;
    public ClientCallback(LinearLayout layout){
        this.layout = layout;
    }

    public ClientCallback(){
    }


    @Override
    public void clientCallback(MqttAndroidClient mqttClient, Context context) {
        //System.out.println("Ci arrivooo");
        mqttClient.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {

            }

            @Override
            public void messageArrived(String topic, MqttMessage message){
                System.out.println(topic);
                if(topic.equals(Property.getProperty("services", context))){
                    new CreateFirstActivity().createLayout(layout, context, new String(message.getPayload()), mqttClient);
                }
                else {
                    MainActivity.topic = topic;
                    System.out.println("Ciao");
                    System.out.println(new String(message.getPayload()));
                    new DrawActivityIntent().drawActivityIntent(new String(message.getPayload()), context);
                }
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });

    }

}

