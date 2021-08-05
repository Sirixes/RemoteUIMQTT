import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public class PublishTrigger implements PublishTriggerInterface {
    @Override
    public void trigger(MqttClient client, String msg, Properties properties) {
        if(msg.equals("syn")){
            new Publisher().publishMessage(client, properties.getProperty("services"), properties.getProperty("mainActivity"));
            new Publisher().publishMessage(client, properties.getProperty("clock"), properties.getProperty("clockLayout"));
        }
    }
}
