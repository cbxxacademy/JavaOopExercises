public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            if (balance < 0) {
                System.out.println("Overdraft used: " + Math.abs(balance));
            }
        } else {
            System.out.println("Withdrawal exceeds overdraft limit. Transaction denied.");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount [Account: " + getAccountNumber() + ", Balance: " + getBalance() + ", Overdraft Limit: " + overdraftLimit + "]";
    }
}
