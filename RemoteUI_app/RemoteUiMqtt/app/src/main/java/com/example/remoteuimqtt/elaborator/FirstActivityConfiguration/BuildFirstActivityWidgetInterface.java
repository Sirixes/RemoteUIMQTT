package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import android.content.Context;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.MqttClient;

public interface BuildFirstActivityWidgetInterface {
    View buildWidget(FragmentActivity activity, Context firstActivityContext, ConfigurationElement element, MqttAndroidClient client);
}
