package OperationElaborator;

import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public interface PublishResultInterface {
    void publishResult(MqttClient client, String result, Properties properties);
}
