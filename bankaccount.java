import java.util.ArrayList;
import java.util.List;

public class BankAccount {  
    private String accountNumber;  
    protected double balance;
    private List<String> transactions;
      
    public BankAccount(String accountNumber, double balance) {  
        this.accountNumber = accountNumber;  
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }  
      
    public String getAccountNumber() {  
        return accountNumber;  
    }  
      
    public double getBalance() {  
        return balance;  
    }

    public void recordTransaction(String transaction) {
        transactions.add(transaction);
    }

    public void getTransactionHistory() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        for (String transaction : transactions) {
            System.out.println("  - " + transaction);
        }
    }
      
    public void deposit(double amount) {  
        if (amount > 0) {  
            balance += amount;  
            System.out.println("Deposited: " + amount);
            recordTransaction("Deposited: " + amount);
        } else {  
            System.out.println("Invalid deposit amount.");  
        }  
    }  
      
    public void withdraw(double amount) {  
        if (amount > 0 && amount <= balance) {  
            balance -= amount;  
            System.out.println("Withdrew: " + amount);
            recordTransaction("Withdrew: " + amount);
        } else {  
            System.out.println("Invalid withdrawal amount or insufficient funds.");  
        }  
    }

    @Override
    public String toString() {
        return "BankAccount [Account: " + getAccountNumber() + ", Balance: " + balance + "]";
    }
    
}
