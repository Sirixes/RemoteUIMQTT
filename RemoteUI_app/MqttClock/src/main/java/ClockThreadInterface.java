import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;
import java.util.Timer;

public interface ClockThreadInterface {

    void startThread(MqttClient client, Properties properties);
}
