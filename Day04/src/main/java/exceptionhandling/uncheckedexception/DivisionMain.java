package exceptionhandling.uncheckedexception;

import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        int a = sc.nextInt();
        System.out.println("Enter denominator");
        int b = sc.nextInt();
        DivisionCalculator.findDivision(a,b);
    }
}
