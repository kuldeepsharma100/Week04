package junit.basicjunittest.calculator;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose an operation: +, -, *, /");
        char op = sc.next().charAt(0);

        try {
            int result;
            switch (op) {
                case '+':
                    result = calc.add(a, b);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = calc.subtract(a, b);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = calc.multiply(a, b);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = calc.divide(a, b);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
