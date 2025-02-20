package junittest.advancejunittest.dateformatter;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancejunittest.dateformatter.DateFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDates() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
        assertEquals("15-08-1947", DateFormatter.formatDate("1947-08-15"));
    }

    @Test
    void testInvalidDates() {
        assertEquals("Invalid date format!", DateFormatter.formatDate("25-12-2023")); // Wrong format
        assertEquals("Invalid date format!", DateFormatter.formatDate("2023/12/25")); // Wrong separator
        assertEquals("Invalid date format!", DateFormatter.formatDate("abcd-ef-gh")); // Non-numeric
        assertEquals("Invalid date format!", DateFormatter.formatDate("")); // Empty string
        assertEquals("Invalid date format!", DateFormatter.formatDate(null)); // Null input
    }
}
