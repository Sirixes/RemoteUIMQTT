package OperationElaborator;

import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.*;

import java.util.Properties;

//Class used to subscribe
public class OperationStringGetter implements ConnectionInterface{
    @Override
    @SneakyThrows
    public void connect(MqttClient subscriber, Properties properties) {

        subscriber.subscribe(properties.getProperty("syn"), (topic, msg) -> {
            System.out.println(msg + " Received on " + topic);
            new PublishTrigger().trigger(subscriber, msg.toString(), properties);
        });

        subscriber.subscribe(properties.getProperty("operationPlus"), (topic, msg) -> {
            System.out.println(msg + " Received on " + topic);
            new StringParser().parserPlus(subscriber, msg.toString(), properties);
        });

        /*
            subscriber.subscribe(properties.getProperty("operationMinus"), (topic, msg) -> {
            System.out.println(msg + " Received on " + topic);
            new StringParser().parserMinus(subscriber, msg.toString(), properties);
        });
        */

    }
}
