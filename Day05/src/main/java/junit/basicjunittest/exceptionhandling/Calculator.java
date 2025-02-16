package junit.basicjunittest.exceptionhandling;

public class Calculator {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10, b = 0;

        try {
            System.out.println("Result: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
