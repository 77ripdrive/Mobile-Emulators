import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Actions;

public class SimpleCalculatorTest extends BaseCalculatorTest  {

    private int expectedResultSum = 9;
    private int expectedResultMultiply = 6;
    private int expectedResultDiv = 8;
    private int expectedResultSubtraction = 3;
    private int expectedResultSumWithDel = 54;


    @Test
    void whenSetNumberThenSumResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 5).click();
        Actions.setMethod(driver, "add").click();
        Actions.setButton(driver, 4).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultSum, Actions.getActualResult(driver));
    }

    @Test
    void whenSetNumberThenMultiplicationResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 2).click();
        Actions.setMethod(driver, "mul").click();
        Actions.setButton(driver, 3).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultMultiply, Actions.getActualResult(driver));
    }

    @Test
    void whenSetNumberThenDivisionResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 8).click();
        Actions.setMethod(driver, "div").click();
        Actions.setButton(driver, 1).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultDiv, Actions.getActualResult(driver));
    }

    @Test
    void whenSetNumberThenSubtractionResultCorrect() {
        Actions.deleteButton(driver).click();
        Actions.setButton(driver, 9).click();
        Actions.setMethod(driver, "sub").click();
        Actions.setButton(driver, 6).click();
        Actions.equalButton(driver).click();
        Assertions.assertEquals(expectedResultSubtraction, Actions.getActualResult(driver));
    }

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
