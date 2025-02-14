package collectionframework.treemap.bankingsystem;

import java.util.*;

class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>(); // AccountNumber -> Balance
    private TreeMap<Double, List<Integer>> sortedAccounts = new TreeMap<>(); // Balance -> List of Accounts
    private Queue<Integer> withdrawalQueue = new LinkedList<>(); // Withdrawal Requests Queue

    // Create an account with an initial balance
    public void createAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        double oldBalance = accounts.get(accountNumber);
        double newBalance = oldBalance + amount;
        accounts.put(accountNumber, newBalance);

        // Update sortedAccounts
        sortedAccounts.get(oldBalance).remove((Integer) accountNumber);
        if (sortedAccounts.get(oldBalance).isEmpty()) {
            sortedAccounts.remove(oldBalance);
        }
        sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Request withdrawal (adds to queue)
    public void requestWithdrawal(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        withdrawalQueue.add(accountNumber);
    }

    // Process withdrawals
    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: " + accountNumber);
        }
    }

    // Display accounts sorted by balance
    public void displayAccountsByBalance() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedAccounts.entrySet()) {
            for (Integer account : entry.getValue()) {
                System.out.println("Account: " + account + " -> Balance: $" + entry.getKey());
            }
        }
    }
}
