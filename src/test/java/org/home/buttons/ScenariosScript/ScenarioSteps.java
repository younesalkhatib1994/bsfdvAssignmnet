package org.home.buttons.ScenariosScript;
import org.home.buttons.Drivers.BaseTest;
import org.home.buttons.HelperMethodsAndroid.HelperMethods;
import PageObjectsAndroid.LoginObjects;
import org.home.buttons.ScrollSwipeMethodsAndroid.ScrollSwipeMethods;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


//This class contains all the steps perform in the application
public class ScenarioSteps extends BaseTest {

    public void TestOne() throws IOException {

        ExtentTest testOne = extent.createTest("Assignment Test Results", "Test Cases");
        testOne.log(Status.INFO,"Test Started");
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./ScreenShots/"+"screen.png"));
        LoginObjects l1 = new LoginObjects(driver);
        wait(3000);
        l1.getLayout().click();
        testOne.log(Status.PASS,"Click on the app layout");
        l1.getActionOnclick().click();
        testOne.log(Status.PASS,"Click on the get action button");
        wait(500);
        HelperMethods helper = new HelperMethods(driver);
        helper.radioText();
        testOne.log(Status.PASS,"Get the text of radio buttons");
        l1.getOkButton().click();
        testOne.log(Status.PASS,"Click on the ok button");
        ScrollSwipeMethods scroll = new ScrollSwipeMethods(driver);
        scroll.scrollNotification();
        testOne.log(Status.PASS,"Scroll to notification");
        wait(500);
        l1.getNotificationToggle().click();
        testOne.log(Status.PASS,"Click on the notification checkbox");
        l1.getVibrationStrength().click();
        testOne.log(Status.PASS,"Click on the vibration button");
        wait(500);
        scroll.swipeAction();
        testOne.log(Status.PASS,"Set the seekbar to 100%");
        l1.getSeekBarOkButton().click();
        l1.getVibrationText().getText().equals("100%");
        testOne.log(Status.PASS,"Click on the ok button");
        l1.getButtonColor().click();
        testOne.log(Status.PASS,"Click on the color button");
        l1.getVioletColor().click();
        testOne.log(Status.PASS,"Click on the violet color");
        testOne.log(Status.INFO, "Test has been completed");
        wait(500);
    }
}



