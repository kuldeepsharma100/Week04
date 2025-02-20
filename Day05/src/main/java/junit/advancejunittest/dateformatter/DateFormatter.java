package junit.advancejunittest.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateFormatter {

    // Converts yyyy-MM-dd to dd-MM-yyyy
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            return "Invalid date format!";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date in yyyy-MM-dd format:");
        String inputDate = sc.nextLine();

        System.out.println("Formatted Date: " + formatDate(inputDate));

        sc.close();
    }
}
