package Config;

import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {

    public static Properties loadFile() {
        Properties props = new Properties();
        try {
            props.load(PropertiesConfig.class.getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

}
