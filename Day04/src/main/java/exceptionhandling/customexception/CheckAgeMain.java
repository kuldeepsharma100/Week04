package exceptionhandling.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckAgeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            CheckAge.CheckAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric age.");
        } finally {
            sc.close();
        }

    }
}