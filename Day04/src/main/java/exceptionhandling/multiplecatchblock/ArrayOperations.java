package exceptionhandling.multiplecatchblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperations {
    public static void arrayOperations(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements in the array: ");
            int size = sc.nextInt();
            if (size <= 0) {
                throw new NullPointerException("Array is not initialized!");
            }

            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Accept index to retrieve
            System.out.print("Enter the index to retrieve: ");
            int index = sc.nextInt();

            // Retrieve and print value at index
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            sc.close();
        }
    }
}
