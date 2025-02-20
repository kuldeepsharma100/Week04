package junittest.advancejunittest.passwordvalidator;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancejunittest.passwordvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongP4ss"));
        assertTrue(PasswordValidator.isValid("Hello123"));
        assertTrue(PasswordValidator.isValid("A1b2c3d4"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(PasswordValidator.isValid("short"));   // Less than 8 characters
        assertFalse(PasswordValidator.isValid("alllowercase1")); // No uppercase
        assertFalse(PasswordValidator.isValid("ALLUPPERCASE1")); // No lowercase
        assertFalse(PasswordValidator.isValid("NoDigitsHere"));  // No digit
        assertFalse(PasswordValidator.isValid(null));     // Null input
        assertFalse(PasswordValidator.isValid(""));       // Empty input
    }
}
