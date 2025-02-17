package reflection.basicproblem.calculator;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Load the Calculator class
            Class<?> clazz = Calculator.class;

            // Create an instance of Calculator
            Object calculatorInstance = clazz.getDeclaredConstructor().newInstance();

            // Get the private method 'multiply'
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            // Invoke the private method
            int result = (int) multiplyMethod.invoke(calculatorInstance, 5, 10);
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
