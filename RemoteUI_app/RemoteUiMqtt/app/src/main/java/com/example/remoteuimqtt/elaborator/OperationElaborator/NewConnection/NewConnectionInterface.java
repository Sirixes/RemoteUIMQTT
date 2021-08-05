package com.example.remoteuimqtt.elaborator.OperationElaborator.NewConnection;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface NewConnectionInterface {
    void newConnection(MqttAndroidClient client, Context context, LinearLayout layout, Button button);
}
