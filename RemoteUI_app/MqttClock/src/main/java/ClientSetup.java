import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.*;

import java.util.Properties;
import java.util.UUID;

public class ClientSetup implements SetupInterface{
    @Override
    @SneakyThrows
    public void setup(Properties properties) {
        //We use a random UUID, so a new client identifier will be generated on every run
        String publisherId = UUID.randomUUID().toString();
        //The server endpoint we're using is a public MQTT broker hosted by the Paho project
        //MqttClient synchronous instance
        MqttClient mqttClient = new MqttClient(properties.getProperty("serverURI"),publisherId);
        //Code used to establish a connection to the server
        mqttClient.connect(new MqttOption().setOptions());
        new OperationStringGetter().connect(mqttClient, properties);
    }
}
