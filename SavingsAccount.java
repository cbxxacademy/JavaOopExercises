public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = amount * interestRate;
            super.deposit(amount + interest);
            System.out.println("Interest earned: " + interest);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount [Account: " + getAccountNumber() + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "]";
    }
}
