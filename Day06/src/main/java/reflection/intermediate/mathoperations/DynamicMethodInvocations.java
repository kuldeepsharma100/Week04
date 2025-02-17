package reflection.intermediate.mathoperations;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocations {
    public static void main(String[] args) {
        try {
            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Get the class object for MathOperations
            Class<?> cls = mathOps.getClass();

            // Create a scanner object to take user input
            Scanner sc = new Scanner(System.in);

            // Ask the user for the operation they want to perform
            System.out.println("Enter the operation (add, subtract, multiply):");
            String operation = sc.nextLine();

            // Ask for the numbers
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();

            // Get the Method object corresponding to the user input
            Method method = cls.getMethod(operation, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(mathOps, a, b);

            // Output the result
            System.out.println("The result of " + operation + " is: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
