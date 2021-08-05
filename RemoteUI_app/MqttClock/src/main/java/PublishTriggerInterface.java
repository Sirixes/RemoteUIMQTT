import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public interface PublishTriggerInterface {

    void trigger(MqttClient client, String msg, Properties properties);
}
