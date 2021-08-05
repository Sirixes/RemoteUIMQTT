package com.example.remoteuimqtt.elaborator.clock;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.elaborator.DrawLayoutActivity;

import org.eclipse.paho.android.service.MqttAndroidClient;

public class ToggleStatus implements ToggleStatusInterface{
    @Override
    public void getStatus(MqttAndroidClient client, Context context, LinearLayout layout) {
        if(DrawLayoutActivity.toggle == 0){
            DrawLayoutActivity.toggle = 1;
            new OnOffPublish(client, context, layout).sendOn();
        }else{
            DrawLayoutActivity.toggle = 0;
            new OnOffPublish(client, context, layout).sendOff();
        }

    }
}
