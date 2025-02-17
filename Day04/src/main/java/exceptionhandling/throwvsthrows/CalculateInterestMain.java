package exceptionhandling.throwvsthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateInterestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter number of years: ");
            int years = sc.nextInt();

            double interest = CalculateInterest.calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            sc.close();
        }
    }

}
