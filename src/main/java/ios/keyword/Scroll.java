package ios.keyword;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class Scroll {

    public static void scrollUp(IOSDriver appiumDriver, int startX, int startY, int endX, int endY){
        TouchAction touchAction = new TouchAction(appiumDriver);
        // 实现页面滑动
        touchAction.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endX, endY));
    }

}
