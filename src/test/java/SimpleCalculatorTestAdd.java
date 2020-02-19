import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Actions.*;

public class SimpleCalculatorTestAdd extends BaseCalculatorTest  {

    private int expectedResultSum = 9;

    @Test
    void whenSetNumberThenSumResultCorrect() {
        deleteButton(driver).click();
        setButton(driver, 5).click();
        setMethod(driver, "add").click();
        setButton(driver, 4).click();
        equalButton(driver).click();
        Assertions.assertEquals(expectedResultSum, getActualResult(driver));
    }

}
