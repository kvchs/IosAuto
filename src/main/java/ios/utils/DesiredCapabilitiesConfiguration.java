package ios.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Properties;

public class DesiredCapabilitiesConfiguration {

    public DesiredCapabilities buildDesiredCapabilities(){
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/ios.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String platformName = properties.getProperty("platformName");
        String deviceName = properties.getProperty("deviceName");
        String platformVersion = properties.getProperty("platformVersion");
        String udid = properties.getProperty("udid");
        String bundleId = properties.getProperty("bundleId");
        String xcodeSigningId = properties.getProperty("xcodeSigningId");


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("appium:deviceName", deviceName);
        desiredCapabilities.setCapability("appium:platformVersion", platformVersion);
        desiredCapabilities.setCapability("appium:udid", udid);
        desiredCapabilities.setCapability("appium:bundleId", bundleId);
        desiredCapabilities.setCapability("appium:xcodeSigningId", xcodeSigningId);
        desiredCapabilities.setCapability("appium:includeSafariInWebviews", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
//      注意：  browserName（浏览器访问） 和 bundleId（app） 不能同时配置
//      desiredCapabilities.setCapability("browserName", "safari");

//      APP安装包
//      desiredCapabilities.setCapability(MobileCapabilityType.APP, "app路径");


        return desiredCapabilities;
    }
}
