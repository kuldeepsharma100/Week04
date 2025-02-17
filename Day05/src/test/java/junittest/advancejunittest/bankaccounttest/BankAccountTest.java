package junittest.advancejunittest.bankaccounttest;

import junit.advancejunittest.bankaccount.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount(1000.0);
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(500.0);
        assertEquals(1500.0, bankAccount.getBalance());
    }

    // Test to check correct balance updates after withdrawal
    @Test
    void testWithdraw() {
        boolean result = bankAccount.withdraw(400.0);
        assertTrue(result);
        assertEquals(600.0, bankAccount.getBalance());
    }

    // Test to ensure withdrawal fails if there are insufficient funds
    @Test
    void testWithdrawInsufficientFunds() {
        boolean result = bankAccount.withdraw(1200.0);
        assertFalse(result);
        assertEquals(1000.0, bankAccount.getBalance());
    }


}
