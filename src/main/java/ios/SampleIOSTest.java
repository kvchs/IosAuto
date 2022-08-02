package ios;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import ios.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SampleIOSTest extends BaseTest{

    @Test
    public void testSampleTest() {
        // iPad mini (6th generation) Simulator (15.5) (6D53BBD5-1C8A-47AD-8AD4-DA2403A846A5)
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad mini (6th generation) Simulator");
//        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "6D53BBD5-1C8A-47AD-8AD4-DA2403A846A5");
//        desiredCapabilities.setCapability("appium:bundleId", "com.brainx.Sign-Up-Demo");
//        desiredCapabilities.setCapability("appium:xcodeSigningId", "iPhone Developer");
//        desiredCapabilities.setCapability("appium:includeSafariInWebviews", true);
//        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        // desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/apps/xxx.app");


//        desiredCapabilities定义在BaseTest中
//        desiredCapabilities.setCapability("platformName", "iOS");
//        desiredCapabilities.setCapability("appium:deviceName", "iPhone");
//        desiredCapabilities.setCapability("appium:platformVersion", "15.5");
//        desiredCapabilities.setCapability("appium:udid", "E2205BE8-07FB-42F7-B2CA-A2EB2585DA24");
//        desiredCapabilities.setCapability("appium:bundleId", "com.brainx.Sign-Up-Demo");
//        desiredCapabilities.setCapability("appium:xcodeSigningId", "iPhone Developer");
//        desiredCapabilities.setCapability("appium:includeSafariInWebviews", true);
//        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
//
//        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//
//        IOSDriver appiumDriver = new IOSDriver(remoteUrl, desiredCapabilities);
//
//        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        appiumDriver.findElement(new AppiumBy.ByAccessibilityId("Group 5318")).getAttribute("type").equals("XCUIElementTypeImage");
        WebElement element = appiumDriver.findElement(By.xpath("//*[@value='First Name']"));
        try {
            element.sendKeys("char");
            appiumDriver.findElement(By.xpath("//*[@value='Last Name']")).sendKeys("Last");
            appiumDriver.findElement(By.xpath("//*[@value='Email']")).sendKeys("test@qq.com");
            appiumDriver.findElement(By.xpath("//*[@value='Password']")).sendKeys("pwd");
            WebElement element2 = appiumDriver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Sign_Up_Demo\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField"));
            element2.sendKeys("23423");
            appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Sign Up\"]"));

//            appiumDriver.hideKeyboard(); IOS上隐藏软键盘不生效

            // 隐藏软键盘
            TouchAction touchAction = new TouchAction(appiumDriver);
            touchAction.tap(new PointOption().withCoordinates(345, 343)).perform();
            Thread.sleep(2000);
            appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Sign Up\"]")).click();

            Thread.sleep(2000);

            WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, Duration.ofMinutes(1));
            webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("\t\n" +
                    "(//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"])[2]"))).click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(element);

    }
}
