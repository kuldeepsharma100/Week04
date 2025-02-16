package junittest.basicjunittest.calculatortest;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.calculator.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(-2, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
