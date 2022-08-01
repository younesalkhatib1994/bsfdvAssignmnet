package org.home.buttons.ScrollSwipeMethodsAndroid;

import org.home.buttons.Drivers.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

//This class contains the swipe and scroll methods
public class ScrollSwipeMethods extends BaseTest {
    public ScrollSwipeMethods(AndroidDriver driver) {
        this.driver = driver;
    }
    public void scrollNotification() {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\"Notification\"))");
    }
    public void swipeAction() {
        WebElement seekBar = driver.findElementByClassName("android.widget.SeekBar");
        int startX=seekBar.getLocation().getX();
        int startY=seekBar.getLocation().getY();
        int end100x=(int)(startX+((seekBar.getSize().getWidth())*100));
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX,startY)).moveTo(PointOption.point(end100x,startY)).release().perform();

    }
}

