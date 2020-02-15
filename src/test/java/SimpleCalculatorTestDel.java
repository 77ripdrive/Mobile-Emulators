import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Actions;

public class SimpleCalculatorTestDel extends BaseCalculatorTest  {

    private int expectedResultSumWithDel = 54;

    @Test
    void whenSetNumberThenSumResultCorrectWithDelete() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 5).click();
        Actions.setButton(driver, 0).click();
        Actions.setButton(driver, 7).click();
        Actions.deleteButton(driver).click();
        Actions.setMethod(driver, "add").click();
        Actions.setButton(driver, 4).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultSumWithDel, Actions.getActualResult(driver));
    }

}
