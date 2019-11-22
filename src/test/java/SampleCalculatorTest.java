import emulators.AndroidEmulator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.junit.jupiter.api.*;

import java.net.MalformedURLException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SampleCalculatorTest extends AndroidEmulator {
   private int expectedResult=9;

    @BeforeAll
    void setAndroidSession() throws MalformedURLException {
        driver = startAndroidEmulator();
    }

    @Test
    void whenSetNumberThenSumCorrect() {
        MobileElement five = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_5");
        five.click();
        AndroidElement plus = (AndroidElement) driver.findElementById("op_add");
        plus.click();
        AndroidElement four = (AndroidElement) driver.findElementById("digit_4");
        four.click();
        AndroidElement equalTo = (AndroidElement) driver.findElementByAccessibilityId("equals");
        equalTo.click();
        AndroidElement results = (AndroidElement) driver.findElementById("result_final");
        int actualResult= Integer.parseInt(results.getText());
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    public void closeSession() {
        close();

    }

}
