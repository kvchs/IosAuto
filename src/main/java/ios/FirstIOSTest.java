package ios;

import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class FirstIOSTest {

    private IOSDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("appium:deviceName", "iPhone");
        desiredCapabilities.setCapability("appium:platformVersion", "15.5");
        desiredCapabilities.setCapability("appium:udid", "E2205BE8-07FB-42F7-B2CA-A2EB2585DA24");
        desiredCapabilities.setCapability("appium:bundleId", "com.brainx.Sign-Up-Demo");
        desiredCapabilities.setCapability("appium:xcodeSigningId", "iPhone Developer");
        desiredCapabilities.setCapability("appium:includeSafariInWebviews", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() throws InterruptedException {
        Thread.sleep(6000);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
