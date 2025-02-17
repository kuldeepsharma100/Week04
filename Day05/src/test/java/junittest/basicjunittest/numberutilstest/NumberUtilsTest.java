package junittest.basicjunittest.numberutilstest;

import junit.basicjunittest.parameterizedtest.NumberUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    private NumberUtils numberUtils;
    @BeforeEach
    void setup() {
        numberUtils = new NumberUtils();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenWithEvenNumbers(int number) {
        assertTrue(numberUtils.isEven(number), number + " should be even");
    }

    // Parameterized test for odd numbers
    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(numberUtils.isEven(number), number + " should be odd");
    }

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();

        test.setup();
        System.out.println("Running parameterized tests...");

        // Manually running the tests
        test.testIsEvenWithEvenNumbers(2);
        test.testIsEvenWithEvenNumbers(4);
        test.testIsEvenWithEvenNumbers(6);

        test.testIsEvenWithOddNumbers(7);
        test.testIsEvenWithOddNumbers(9);
    }
}
