package com.example.remoteuimqtt.elaborator.OperationElaborator.NewConnection;
import android.content.Context;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.OperationElaborator.OperationStringPublish;
import com.example.remoteuimqtt.elaborator.clock.ToggleStatus;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import lombok.SneakyThrows;

public class NewConnection implements NewConnectionInterface{
    @Override
    @SneakyThrows
    public void newConnection(MqttAndroidClient client, Context context, LinearLayout layout, Button button) {
        IMqttToken token = client.connect();
        token.setActionCallback(new IMqttActionListener() {
            @Override
            public void onSuccess(IMqttToken asyncActionToken) {
                if(button.getTag().equals("=")){
                    new OperationStringPublish().publishString(client, context, layout);
                }else if(button.getTag().equals("toggle")){
                    new ToggleStatus().getStatus(client, context, layout);
                }
            }

            @Override
            public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                // Something went wrong e.g. connection timeout or firewall problems
                Log.d("Second Connection", "Failed");
            }
        });
    }
}
