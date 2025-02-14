package collectionframework.treemap.bankingsystem;

public class BankingSystemMain {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Creating accounts
        bank.createAccount(101, 500.0);
        bank.createAccount(102, 1000.0);
        bank.createAccount(103, 750.0);

        // Depositing money
        bank.deposit(101, 200.0);
        bank.deposit(103, 250.0);

        // Requesting withdrawals
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(101);

        // Display accounts sorted by balance
        bank.displayAccountsByBalance();

        // Processing withdrawals
        bank.processWithdrawals();
    }

}
