package PageObjectsAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;



public class LoginObjects {
    public LoginObjects() {
    }
    public LoginObjects(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/click_subtitle_textviews']")
    private MobileElement actionOnclick;

    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/layout_tuto']")
    private MobileElement layout;

    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/notification_checkbox']")
    private MobileElement notificationToggle;

    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/vibration_strength_layout']")
    private MobileElement vibrationStrength;

    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/color_layout']")
    private MobileElement buttonColor;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[4]")
    private MobileElement violetColor;

    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/ok_textview']")
    private MobileElement seekBarOkButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    private  MobileElement okButton;

    public MobileElement getVibrationText() {
        return vibrationText;
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.home.button.bottom:id/vibration_strength_subtitle_textview']")
    private MobileElement vibrationText;


    public MobileElement getLayout() {
        return layout;
    }

    public MobileElement getOkButton() {
        return okButton;
    }

    public MobileElement getActionOnclick() {
        return actionOnclick;
    }

    public MobileElement getNotificationToggle() {
        return notificationToggle;
    }

    public MobileElement getVibrationStrength() {
        return vibrationStrength;
    }

    public MobileElement getButtonColor() {
        return buttonColor;
    }

    public MobileElement getVioletColor() {
        return violetColor;
    }
    public MobileElement getSeekBarOkButton() {
        return seekBarOkButton;
    }



}



