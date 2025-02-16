package junittest.basicjunittest.exceptionhandlingtest;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.calculator.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testDivideValid() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-3, calculator.divide(-9, 3));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
