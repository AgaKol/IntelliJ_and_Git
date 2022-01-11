import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void hasAdd () {
        assertEquals(calculator.add(2,3), 5);
    }

    @Test
    public void hasSubtract () {
        assertEquals(calculator.subtract(18, 4), 14);
    }

    @Test
    public void hasMultiply () {
        assertEquals(calculator.multiply(3, 5), 15);
    }

    @Test
    public void hasDivide () {
        assertEquals(calculator.divide(21, 3), 7);
    }
}
