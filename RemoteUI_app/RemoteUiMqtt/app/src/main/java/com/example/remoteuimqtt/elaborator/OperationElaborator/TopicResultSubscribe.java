package com.example.remoteuimqtt.elaborator.OperationElaborator;

import android.content.Context;
import android.widget.LinearLayout;
import com.example.remoteuimqtt.elaborator.Interface.Property;

import org.eclipse.paho.android.service.MqttAndroidClient;

import lombok.SneakyThrows;

public class TopicResultSubscribe implements TopicResultSubscribeInterface {
    @Override
    @SneakyThrows
    public void resultTopic(MqttAndroidClient client, Context context, LinearLayout layout) {
        client.subscribe(Property.getProperty("result", context), 1);
        new Result().getResult(client, layout, context);
    }
}
