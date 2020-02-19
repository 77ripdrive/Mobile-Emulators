import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Actions.*;

public class SimpleCalculatorTestDel extends BaseCalculatorTest  {

    private int expectedResultSumWithDel = 54;

    @Test
    void whenSetNumberThenSumResultCorrectWithDelete() {
        deleteButton(driver).click();
        setButton(driver, 5).click();
        setButton(driver, 0).click();
        setButton(driver, 7).click();
        deleteButton(driver).click();
        setMethod(driver, "add").click();
        setButton(driver, 4).click();
        equalButton(driver).click();
        Assertions.assertEquals(expectedResultSumWithDel, getActualResult(driver));
    }

}
