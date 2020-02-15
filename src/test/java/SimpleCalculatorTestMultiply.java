import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Actions;

public class SimpleCalculatorTestMultiply extends BaseCalculatorTest {

    private int expectedResultMultiply = 6;

    @Test
    void whenSetNumberThenMultiplicationResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 2).click();
        Actions.setMethod(driver, "mul").click();
        Actions.setButton(driver, 3).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultMultiply, Actions.getActualResult(driver));
    }

}
