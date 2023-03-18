import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest
{
    private static final double DELTA = 1e-15;

    Calculator calculator = new Calculator();

    @Test
    public void squarerootTestTruePositive(){
        assertEquals("Test for Square Root with true positive", 3, calculator.squareRoot(9), DELTA);
        assertEquals("Test for Square Root with true positive", 0, calculator.squareRoot(0), DELTA);
        assertEquals("Test for Square Root with true positive", 1, calculator.squareRoot(1), DELTA);
        assertEquals("Test for Square Root with true positive", 5, calculator.squareRoot(25), DELTA);
    }

    @Test
    public void squarerootTestFalsePositive(){
        assertNotEquals("Test for Square Root with False positive", 81, calculator.squareRoot(9), DELTA);
        assertNotEquals("Test for Square Root with False positive", 1, calculator.squareRoot(0), DELTA);
        assertNotEquals("Test for Square Root with False positive", 0, calculator.squareRoot(1), DELTA);
        assertNotEquals("Test for Square Root with False positive", 125, calculator.squareRoot(25), DELTA);
    }


    @Test
    public void factorialTestTruePositive(){
        assertEquals("Test for factorial with true positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Test for factorial with true positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Test for factorial with true positive", 1, calculator.factorial(0), DELTA);
        assertEquals("Test for factorial with true positive", 1, calculator.factorial(1), DELTA);
    }

    @Test
    public void factorialTestFalsePositive(){
        assertNotEquals("Test for factorial with false positive", 125, calculator.factorial(5), DELTA);
        assertNotEquals("Test for factorial with false positive", 0, calculator.factorial(0), DELTA);
        assertNotEquals("Test for factorial with false positive", 0, calculator.factorial(1), DELTA);
        assertNotEquals("Test for factorial with false positive", 9, calculator.factorial(3), DELTA);
    }
}
