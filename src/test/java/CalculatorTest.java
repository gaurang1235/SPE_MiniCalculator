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

    @Test
    public void logarithmTestTruePositive(){
        assertEquals("Test for logarithm with true positive", 0, calculator.log(1), DELTA);
        assertEquals("Test for logarithm with true positive", 1, calculator.log(Math.exp(1)), DELTA);
    }

    @Test
    public void logarithmTestFalsePositive(){
        assertNotEquals("Test for logarithm with false positive", 1, calculator.log(10), DELTA);
        assertNotEquals("Test for logarithm with false positive", 0, calculator.log(Math.exp(1)), DELTA);
        assertNotEquals("Test for logarithm with false positive", 1, calculator.log(1), DELTA);
    }


    @Test
    public void powerTestTruePositive(){
        assertEquals("Test for power fn with true positive", 125, calculator.power(5,3), DELTA);
        assertEquals("Test for power fn with true positive", 1, calculator.power(0,0), DELTA);
        assertEquals("Test for power fn with true positive", 1, calculator.power(1,5), DELTA);
        assertEquals("Test for power fn with true positive", 9, calculator.power(3,2), DELTA);
    }

    @Test
    public void powerTestFalsePositive(){
        assertNotEquals("Test for power fn with false positive", 125, calculator.power(5,2), DELTA);
        assertNotEquals("Test for power fn with false positive", 0, calculator.power(0,0), DELTA);
        assertNotEquals("Test for power fn with false positive", 5, calculator.power(1,5), DELTA);
        assertNotEquals("Test for power fn with false positive", 6, calculator.power(3,2), DELTA);
    }
}
