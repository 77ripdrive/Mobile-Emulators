import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Actions;

public class SimpleCalculatorTestSub extends BaseCalculatorTest {

    private int expectedResultSubtraction = 3;

    @Test
    void whenSetNumberThenSubtractionResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 9).click();
        Actions.setMethod(driver, "sub").click();
        Actions.setButton(driver, 6).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultSubtraction, Actions.getActualResult(driver));
    }

}
