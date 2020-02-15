import emulators.AndroidEmulator;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.net.MalformedURLException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseCalculatorTest {

    protected AppiumDriver driver;

    @BeforeAll
    void setAndroidSession() throws MalformedURLException {
        driver = AndroidEmulator.startAndroidEmulator();
    }

    @AfterAll
    public void closeSession() {
        AndroidEmulator.close();
    }
}
