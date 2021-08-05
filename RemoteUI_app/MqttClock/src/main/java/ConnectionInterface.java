import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public interface ConnectionInterface {

     void connect(MqttClient subscriber, Properties properties);
}
