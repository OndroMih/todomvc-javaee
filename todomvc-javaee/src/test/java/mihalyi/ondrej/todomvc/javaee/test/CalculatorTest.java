package mihalyi.ondrej.todomvc.javaee.test;

import mihalyi.ondrej.todomvc.javaee.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
        calculator.number(1);
        calculator.number(3);
        calculator.number(5);
        calculator.number(7);
        assertEquals("Calculator result", "1357", calculator.getData());
    }

    @Test
    public void plus_operation_works() {
        calculator.number(1);
        calculator.number(3);
        calculator.plus();
        calculator.number(3);
        assertEquals("Calculator result 13 + 3", "16", calculator.getData());
    }

    @Test
    public void multiply_operation_works() {
        calculator.number(1);
        calculator.number(3);
        calculator.multiply();
        calculator.number(3);
        assertEquals("Calculator result 13 * 3", "39", calculator.getData());
    }
    
    @Test
    public void divide_with_int_result_works() {
        calculator.number(1);
        calculator.number(0);
        calculator.divide();
        calculator.number(2);
        assertEquals("Calculator result 10 / 2", "5", calculator.getData());
    }
}
