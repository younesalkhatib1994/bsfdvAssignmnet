package org.home.buttons.HelperMethodsAndroid;

import org.home.buttons.Drivers.BaseTest;
import PageObjectsAndroid.LoginObjects;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

//In this class you will find defined methods that helps running the automation script
import java.util.List;
public class HelperMethods extends BaseTest {
    public HelperMethods(AndroidDriver driver) {
        this.driver = driver;
    }
    public void radioText(){
        //This method is used to travers through all the radio buttons in the list and print the text for each
        LoginObjects obj = new LoginObjects();
        final List<WebElement> radioButtonsText = driver.findElementsByXPath("//*[@resource-id='android:id/text1']");
        int count = radioButtonsText.size();
        for(int i=0; i<count; i++){
            System.out.println(radioButtonsText.get(i).getText());
        }
    }
}
