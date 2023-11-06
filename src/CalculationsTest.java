import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import telran.numbers.Calculations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class CalculationsTest {
    double op1 = 10.5;
    double op2 = 0.5;
    double op1Negative = -10.5;
    double op2Negative = -0.5;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before all tests");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After all tests");
    }

    @Test
    @DisplayName("sum of two numbers")
    public void sum() {

        double expected = 11;
        Assert.assertEquals(expected, Calculations.sum(op1, op2), 0.1);

        expected = 10;
        assertEquals(expected, Calculations.sum(op1, op2Negative), 0.1);

        expected = -11;
        assertEquals(expected, Calculations.sum(op1Negative, op2Negative), 0.1);
    }

    @Test
    @DisplayName("subtract of two numbers")
    public void subtract() {
        assertEquals(10, Calculations.subtract(op1, op2), 0.1);
        assertEquals(11, Calculations.subtract(op1, op2), 0.1);
        assertEquals(-10, Calculations.subtract(op1Negative, op2Negative), 0.1);
    }

    @Test
    @DisplayName("multiply of two numbers")
    public void multiply() {
        assertEquals(5.25, Calculations.multiply(op1, op2), 0.1);
        assertEquals(5.25, Calculations.multiply(op1, op2Negative), 0.1);
        assertEquals(5.25, Calculations.multiply(op1Negative, op2Negative), 0.1);
    }

    @Test
    @DisplayName("divide of two numbers")
    public void divide() {
        assertEquals(21, Calculations.divide(op1, op2), 0.1);
        assertEquals(-21, Calculations.divide(op1, op2Negative), 0.1);
        assertEquals(21, Calculations.divide(op1Negative, op2Negative), 0.1);
        assertEquals(Double.POSITIVE_INFINITY, Calculations.divide(op1, 0), 0.1);
        assertEquals(Double.NEGATIVE_INFINITY, Calculations.divide(op1Negative, 0), 0.1);
    }
}