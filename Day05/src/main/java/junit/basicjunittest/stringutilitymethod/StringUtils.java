package junit.basicjunittest.stringutilitymethod;

import java.util.Scanner;

public class StringUtils {

    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        if (str == null) return false;
        return str.equalsIgnoreCase(reverse(str));
    }

    public String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Reverse String");
        System.out.println("2. Check if Palindrome");
        System.out.println("3. Convert to Uppercase");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Reversed String: " + stringUtils.reverse(input));
                break;
            case 2:
                System.out.println("Is Palindrome? " + stringUtils.isPalindrome(input));
                break;
            case 3:
                System.out.println("Uppercase String: " + stringUtils.toUpperCase(input));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
