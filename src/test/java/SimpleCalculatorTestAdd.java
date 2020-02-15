import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Actions;

public class SimpleCalculatorTestAdd extends BaseCalculatorTest  {

    private int expectedResultSum = 9;

    @Test
    void whenSetNumberThenSumResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 5).click();
        Actions.setMethod(driver, "add").click();
        Actions.setButton(driver, 4).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultSum, Actions.getActualResult(driver));
    }

}
