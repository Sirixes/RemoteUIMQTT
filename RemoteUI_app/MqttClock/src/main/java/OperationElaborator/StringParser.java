package OperationElaborator;

import org.eclipse.paho.client.mqttv3.MqttClient;

import java.util.Properties;

public class StringParser implements StringParserMinusInterface, StringParserPlusInterface {
    @Override
    public void parserPlus(MqttClient client, String operation, Properties properties) {
        //The plus sign (+) is used to indicate that consecutive delimiters should be treated as one
        int result = 0;
        String delims = "[+]+";
        String[] tokens = operation.split(delims);
        for (String token : tokens){
            result += Integer.parseInt(token);
        }
        System.out.println(result);
        new PublishResult().publishResult(client, String.valueOf(result), properties);

    }

    @Override
    public void parserMinus(MqttClient client, String operation, Properties properties) {
        String delims = "[-]+";
        String[] tokens = operation.split(delims);
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            result -= Integer.parseInt(tokens[i]);
        }
        new PublishResult().publishResult(client, String.valueOf(result), properties);
    }
}
