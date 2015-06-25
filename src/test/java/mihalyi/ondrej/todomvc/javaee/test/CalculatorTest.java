package mihalyi.ondrej.todomvc.javaee.test;

import mihalyi.ondrej.todomvc.javaee.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ondro
 */
public class CalculatorTest {

    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void pressing_numbers_works() {
        pressNumber(1);
        pressNumber(3);
        pressNumber(5);
        pressNumber(7);
        calculationResultIs("1357.0", calculationResult());
    }

 protected String calculationResult() {
  return calculator.getData();
 }

    @Test
    public void plus_operation_works() {
        calculator.number(1);
        calculator.number(3);
        calculator.plus();
        calculator.number(3);
        calculator.computeResult();
        assertEquals("Calculator result 13 + 3", "16.0", calculationResult());
    }

    @Test
    public void multiply_operation_works() {
        calculator.number(1);
        calculator.number(3);
        calculator.multiply();
        calculator.number(3);
        calculator.computeResult();
        assertEquals("Calculator result 13 * 3", "39.0", calculationResult());
    }
    
    @Test
    public void divide_with_int_result_works() {
        calculator.number(1);
        calculator.number(0);
        calculator.divide();
        calculator.number(2);
        calculator.computeResult();
        assertEquals("Calculator result 10 / 2", "5.0", calculationResult());
    }

 private void pressNumber(int i) {
  calculator.number(i);
 }

 private void calculationResultIs(String value, String calculationResult) {
  assertEquals("Calculator result", value, calculationResult);
 }
}
