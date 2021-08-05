import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;


public class PropertyGetter implements Property {


    @Override
    @SneakyThrows
    public Properties getProperty() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("address.properties");
        Properties p=new Properties();
        p.load(inputStream);
        return p;
    }
}
