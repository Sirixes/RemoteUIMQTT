package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.Button;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.ConfigurationElement;

import org.eclipse.paho.android.service.MqttAndroidClient;

public interface ButtonFirstActivityInterface {

    View createButton(LayoutInflater inflater, ConfigurationElement configurationElement, MqttAndroidClient client, Context context );
}
