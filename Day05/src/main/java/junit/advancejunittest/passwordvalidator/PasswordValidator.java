package junit.advancejunittest.passwordvalidator;

import java.util.Scanner;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (hasUpperCase && hasDigit) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to validate: ");
        String password = sc.nextLine();

        if (isValid(password)) {
            System.out.println("Password is valid ");
        } else {
            System.out.println("Password is invalid");
        }

        sc.close();
    }


}
