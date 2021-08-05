package OperationElaborator;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public interface PublisherInterface {

    void publishMessage(IMqttClient mqttClient, String topic, String fileName);
}
