package ios.utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties = null;

    static {
        properties = new Properties();
        try {
            properties.load(ConfigReader.class.getResourceAsStream("/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getPlatform(){
        return properties.getProperty("PLATFORM_NAME");
    }


    public static String getAppiumServerUrl(){
        return properties.getProperty("APPIUM_SERVER_URL");
    }

    public static void main(String[] args) {
        System.out.println(ConfigReader.getPlatform() + " " + ConfigReader.getAppiumServerUrl());
    }
}
