import lombok.SneakyThrows;

public class MainClass {
    @SneakyThrows
    public static void main(String [] args){
        new ClientSetup().setup(new PropertyGetter().getProperty());
    }
}
