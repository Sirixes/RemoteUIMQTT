import lombok.SneakyThrows;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

public class ClockThread implements ClockThreadInterface {
    @Override
    @SneakyThrows
    public void startThread(MqttClient client, Properties properties) {
        MainClass.timer.scheduleAtFixedRate(new TimerTask() {
            @SneakyThrows
            @Override
            public void run() {
                byte[] payload = (java.time.LocalTime.now().toString()).getBytes();
                MqttMessage msg = new MqttMessage(payload);
                msg.setQos(1);
                msg.setRetained(true);
                client.publish(properties.getProperty("clockTime"),msg);
            }
        }, 1000, 1000);
    }
}
