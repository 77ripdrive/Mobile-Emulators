import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Actions.*;

public class SimpleCalculatorTestDiv extends BaseCalculatorTest  {

    private int expectedResultDiv = 8;

    @Test
    void whenSetNumberThenDivisionResultCorrect() {
        deleteButton(driver).click();
        setButton(driver, 8).click();
        setMethod(driver, "div").click();
        setButton(driver, 1).click();
        equalButton(driver).click();
        Assertions.assertEquals(expectedResultDiv, getActualResult(driver));
    }

}
