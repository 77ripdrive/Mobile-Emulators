package emulators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class AndroidEmulator {

    private static AppiumDriver driver;
    private final static Logger lOGGER = Logger.getLogger(AndroidEmulator.class.getName());

    public static   AppiumDriver startAndroidEmulator() throws MalformedURLException {
        if (null == driver) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.15.1");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "8");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("deviceName", "pixel_2");
            capabilities.setCapability("appPackage", "com.google.android.calculator");
            capabilities.setCapability("appWaitPackage", "com.google.android.calculator");
            capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
            capabilities.setCapability("appWaitActivity", "com.android.calculator2.Calculator");
            capabilities.setCapability("noReset", true);
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
        lOGGER.info("Emulator is started");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        return driver;
    }

    public static void close() {
        driver.quit();
        driver = null;
        lOGGER.info("Emulator is closed");
    }
}
