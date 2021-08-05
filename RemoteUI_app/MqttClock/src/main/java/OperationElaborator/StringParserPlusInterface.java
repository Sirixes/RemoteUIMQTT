package OperationElaborator;

import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public interface StringParserPlusInterface {
    void parserPlus(MqttClient client, String operation, Properties properties);

}
