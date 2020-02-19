package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Actions {

    public static AndroidElement setButton(AppiumDriver driver, int number) {
        return (AndroidElement) driver.findElementById(String.format("digit_%d", number));
    }

    public static AndroidElement setMethod(AppiumDriver driver, String method) {
        return (AndroidElement) driver.findElementById(String.format("op_%s", method));
    }

    public static AndroidElement equalButton(AppiumDriver driver) {
        return (AndroidElement) driver.findElementByAccessibilityId("equals");
    }

    public static AndroidElement deleteButton(AppiumDriver driver) {
        return (AndroidElement) driver.findElementByAccessibilityId("delete");
    }

    public static int getActualResult(AppiumDriver driver) {
        AndroidElement result = (AndroidElement) driver.findElementById("result_final");
        int actualResult = Integer.parseInt(result.getText());
        return actualResult;
    }
}
