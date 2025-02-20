package junittest.advancejunittest.userregistrationtest;

import junit.advancejunittest.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    @Test
    public void testValidUserRegistration() {
        assertTrue(UserRegistration.registerUser("john", "john@example.com", "password123"));
    }

    @Test
    public void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "email", "pass"));
    }
}
