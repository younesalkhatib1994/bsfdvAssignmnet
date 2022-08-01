package org.home.buttons.Drivers;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.home.buttons.ExtentReport.AppReports;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

// This class contains the desired capabilities
public class BaseTest extends AppReports {

    public AndroidDriver driver;

    @BeforeTest
    public void capabilities() throws MalformedURLException {

        String apkpath="/Users/jolt-dl-ho-mac116/Desktop/MultiactionHomeButtonbase.apk";
        File app=new File(apkpath);
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_XL_API_29");
        dc.setCapability(AndroidMobileCapabilityType.AVD,"Pixel_3a_XL_API_29");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.home.button.activity.MainActivity");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.home.button.bottom");
        dc.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);


    }
    @AfterTest
    public void tearDown(){

        driver.quit();

    }
    public void wait(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
