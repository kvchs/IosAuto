import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;

public class Application {

    IOSDriver driver;

    public static void main(String[] args) {
        System.out.println("IOS");

//        Instead of starting Appium server manually, we can start it from code.
//        new AppiumServiceBuilder().usingAnyFreePort().build().start();


    }
    @Test
    public void test(){
        System.out.println("run");
    }

    @BeforeClass
    public void classInit() throws URISyntaxException, MalformedURLException {
        URL testAppUrl = getClass().getClassLoader().getResource("IpaDownloadTool.ipa");
        System.out.println(testAppUrl);
        File testAppFile = Paths.get(Objects.requireNonNull(testAppUrl).toURI()).toFile();
        String testAppPath = testAppFile.getAbsolutePath();
        DesiredCapabilities desiredCaps = new DesiredCapabilities();
        desiredCaps = desiredCaps;
        desiredCaps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone7");
        desiredCaps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCaps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.1");
        desiredCaps.setCapability(MobileCapabilityType.APP, testAppPath);
        driver= new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCaps);
        driver.closeApp();
    }
    @BeforeMethod
    public void testInit() {
        if (driver != null) {
            driver.launchApp();
        }
    }
    @AfterMethod
    public void testCleanup() {
        if (driver != null) {
            driver.closeApp();
        }
    }
}
