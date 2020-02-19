import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Actions.*;

public class SimpleCalculatorTestSub extends BaseCalculatorTest {

    private int expectedResultSubtraction = 3;

    @Test
    void whenSetNumberThenSubtractionResultCorrect() {
        deleteButton(driver).click();
        setButton(driver, 9).click();
        setMethod(driver, "sub").click();
        setButton(driver, 6).click();
        equalButton(driver).click();
        Assertions.assertEquals(expectedResultSubtraction, getActualResult(driver));
    }

}
