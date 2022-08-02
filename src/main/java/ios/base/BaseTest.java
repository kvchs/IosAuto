package ios.base;

import io.appium.java_client.ios.IOSDriver;
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


        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new IOSDriver(remoteUrl, new DesiredCapabilitiesConfiguration().buildDesiredCapabilities());

        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass(){

        appiumDriver.quit();

    }
}
