package OperationElaborator;

import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public interface StringParserMinusInterface {
    void parserMinus(MqttClient client, String operation, Properties properties);
}
