package exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;

public class DivisionCalculator {
    public static void findDivision(int numerator , int denominator){
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
}
