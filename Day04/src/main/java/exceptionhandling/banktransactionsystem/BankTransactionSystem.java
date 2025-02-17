package exceptionhandling.banktransactionsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize account with a balance
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric amount.");
        } finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }

}
