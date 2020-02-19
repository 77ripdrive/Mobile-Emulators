import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Actions.*;

public class SimpleCalculatorTestMultiply extends BaseCalculatorTest {

    private int expectedResultMultiply = 6;

    @Test
    void whenSetNumberThenMultiplicationResultCorrect() {
        deleteButton(driver).click();
        setButton(driver, 2).click();
        setMethod(driver, "mul").click();
        setButton(driver, 3).click();
        equalButton(driver).click();
        Assertions.assertEquals(expectedResultMultiply, getActualResult(driver));
    }

}
