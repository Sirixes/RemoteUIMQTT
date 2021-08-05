package OperationElaborator;

import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import java.io.BufferedReader;
import java.io.FileReader;

public class Publisher implements PublisherInterface, PublisherExtender {
    @Override
    @SneakyThrows
    public void publishMessage(IMqttClient mqttClient, String topic, String fileName) {
        byte[] payload = (readFile(fileName)).getBytes();
        //byte[] payload = ("").getBytes();
        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(1);
        if(!topic.equals("android/service")){
            msg.setRetained(true);
        }
        mqttClient.publish(topic,msg);
    }

    @SneakyThrows
    public String readFile(String fileName){
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder file = new StringBuilder();
        while ((line = br.readLine()) != null) {
            file.append(line).append("\n");
        }
        return file.toString();
    }
}
