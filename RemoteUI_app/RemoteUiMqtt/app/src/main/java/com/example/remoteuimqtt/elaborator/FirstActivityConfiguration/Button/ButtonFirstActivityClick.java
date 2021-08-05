package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.Button;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.LayoutTopicSubscribe;
import com.example.remoteuimqtt.elaborator.TopicSubscribe;

import org.eclipse.paho.android.service.MqttAndroidClient;

public class ButtonFirstActivityClick implements ButtonFirstActivityClickInterface{
    @Override
    public void click(Button button, String topic, MqttAndroidClient client, Context context) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LayoutTopicSubscribe().topicSubscribe(client, context, topic);
            }
        });
    }
}
