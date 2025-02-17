package exceptionhandling.nestedtrycatchblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchExample {
    public static void nestedBlock(){
        Scanner sc = new Scanner(System.in);

        try {
            // Taking array input
            System.out.print("Enter the number of elements in the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Taking index input
            System.out.print("Enter the index to access: ");
            int index = sc.nextInt();

            try {
                int value = arr[index]; // May throw ArrayIndexOutOfBoundsException

                // Taking divisor input
                System.out.print("Enter the divisor: ");
                int divisor = sc.nextInt();

                try {
                    int result = value / divisor; // May throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            System.out.println("Operation completed.");
            sc.close();
        }

    }
}
