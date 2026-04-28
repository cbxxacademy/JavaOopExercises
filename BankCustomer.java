import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private List<BankAccount> accounts;

    public BankCustomer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public double totalBalance() {
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public void generateReport() {
        System.out.println("=== Banking Report for " + name + " ===");
        for (BankAccount account : accounts) {
            System.out.println(account.toString());
        }
        System.out.println("Total Balance: " + totalBalance());
    }
}
