package junit.advancejunittest.temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {

    // Converts Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.println("Convert to (C/F)? ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'F') {
            System.out.println(value + "°C = " + celsiusToFahrenheit(value) + "°F");
        } else if (choice == 'C') {
            System.out.println(value + "°F = " + fahrenheitToCelsius(value) + "°C");
        } else {
            System.out.println("Invalid choice! Use 'C' for Celsius or 'F' for Fahrenheit.");
        }

        sc.close();
    }
}
