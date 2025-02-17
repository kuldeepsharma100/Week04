package junit.advancejunittest.bankaccount;

public class BankAccount {

    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;  // If insufficient funds, return false
    }
    public double getBalance() {
        return balance;
    }

    // Main method to test the BankAccount class manually
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + bankAccount.getBalance());

        // Test deposit
        bankAccount.deposit(500.0);  // Deposit 500
        System.out.println("Balance after deposit: " + bankAccount.getBalance());

        // Test withdraw
        boolean withdrawSuccess = bankAccount.withdraw(400.0);
        System.out.println("Withdrawal successful: " + withdrawSuccess);
        System.out.println("Balance after withdrawal: " + bankAccount.getBalance());

        // Test insufficient funds
        boolean withdrawFail = bankAccount.withdraw(2000.0);
        System.out.println("Withdrawal successful: " + withdrawFail);
        System.out.println("Balance after failed withdrawal: " + bankAccount.getBalance());
    }
}
