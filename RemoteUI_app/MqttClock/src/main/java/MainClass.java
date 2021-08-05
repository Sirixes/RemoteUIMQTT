import lombok.SneakyThrows;

import java.util.Timer;

public class MainClass {

    public static Timer timer;
    @SneakyThrows
    public static void main(String [] args){
        new ClientSetup().setup(new PropertyGetter().getProperty());
    }
}
