package junittest.basicjunittest.stringutilitymethod;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.stringutilitymethod.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("54321", stringUtils.reverse("12345"));
        assertEquals("", stringUtils.reverse(""));  // Empty string case
        assertNull(stringUtils.reverse(null));  // Null case
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("MadAm"));  // Case-insensitive check
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome("java"));
        assertFalse(stringUtils.isPalindrome(null));  // Null case
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
        assertEquals("123ABC", stringUtils.toUpperCase("123abc"));  // Numbers should remain unchanged
        assertNull(stringUtils.toUpperCase(null));  // Null case
    }
}
