package ios.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import ios.utils.ConfigReader;
import ios.utils.DesiredCapabilitiesConfiguration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public IOSDriver appiumDriver;

    @BeforeClass
    public void ExecConfiguration() throws MalformedURLException {


        URL remoteUrl = new URL(ConfigReader.getAppiumServerUrl());

        if (ConfigReader.getPlatform().equals("IOS")){
            appiumDriver = new IOSDriver(remoteUrl, new DesiredCapabilitiesConfiguration().buildDesiredCapabilities());
        }else if(ConfigReader.getPlatform().equals("ANDROID")){
//            appiumDriver = new AndroidDriver(remoteUrl, new DesiredCapabilitiesConfiguration().buildDesiredCapabilities())
            System.out.println("初始化Android环境");
        }

        appiumDriver = new IOSDriver(remoteUrl, new DesiredCapabilitiesConfiguration().buildDesiredCapabilities());

        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass(){

        appiumDriver.quit();

    }
}
