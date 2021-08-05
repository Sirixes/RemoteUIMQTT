import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

public class MqttOption implements MqttOptionInterface{
    @Override
    public MqttConnectOptions setOptions() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setAutomaticReconnect(true);
        options.setCleanSession(true);
        options.setConnectionTimeout(10);
        return options;
    }
}
