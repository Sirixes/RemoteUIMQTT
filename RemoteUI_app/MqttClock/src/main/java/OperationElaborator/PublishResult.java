package OperationElaborator;

import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Properties;

public class PublishResult implements PublishResultInterface{
    @Override
    @SneakyThrows
    public void publishResult(MqttClient client, String result, Properties properties) {

        byte[] payload = (result).getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        //msg.setRetained(true);
        client.publish(properties.getProperty("result"),msg);
    }
}
