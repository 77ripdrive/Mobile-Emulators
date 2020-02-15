import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Actions;

public class SimpleCalculatorTestDiv extends BaseCalculatorTest  {

    private int expectedResultDiv = 8;

    @Test
    void whenSetNumberThenDivisionResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 8).click();
        Actions.setMethod(driver, "div").click();
        Actions.setButton(driver, 1).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultDiv, Actions.getActualResult(driver));
    }

}
