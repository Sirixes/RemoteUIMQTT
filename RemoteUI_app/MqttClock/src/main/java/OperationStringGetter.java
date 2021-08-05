import com.sun.tools.javac.Main;
import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.*;

import java.util.Properties;
import java.util.Timer;

//Class used to subscribe
public class OperationStringGetter implements ConnectionInterface{
    @Override
    @SneakyThrows
    public void connect(MqttClient client, Properties properties) {

        client.subscribe(properties.getProperty("syn"), (topic, msg) -> {
            System.out.println(msg + " Received on " + topic);
            new PublishTrigger().trigger(client, msg.toString(), properties);
        });


        client.subscribe(properties.getProperty("onOff"), (topic, msg) -> {
            System.out.println(msg + " Received on " + topic);
            if(msg.toString().equals("on")){
                MainClass.timer = new Timer();
                new ClockThread().startThread(client, properties);
            }else if(msg.toString().equals("off")){
                MainClass.timer.cancel();
                MainClass.timer.purge();
            }
        });

    }
}
