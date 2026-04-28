public class Main {
    public static void main(String[] args) {
        System.out.println("======= Java OOP Exercises Started =======");
        
        System.out.println("");
        System.out.println("=============== Exercise 0 ===============");
        // Exercise 0: Using the Example Person Class

        // Initialization a new Person object
        Person person = new Person("Simon", 24);
        
        // Example that prints "Hello, my name is [name]."
        System.out.println("Hello, my name is " + person.getName() + ".");
        
        // Complete the code to print "I'm [age] years old."
        System.out.println("TODO");
        
        
        System.out.println("");
        System.out.println("=============== Exercise 1 ===============");
        // Exercise 1: Creating a Bank Account
        // Create a BankAccount instance
        // Perform deposit and withdrawal operations.

        BankAccount account = new BankAccount("12345", 1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Account Balance: " + account.getBalance());
        
        
        System.out.println("");
        System.out.println("=============== Exercise 2 ===============");
        // Exercise 2: Creating a Savings Account
        // Create a SavingsAccount instance
        // Perform deposit operations with interest
        SavingsAccount savings = new SavingsAccount("67890", 500, 0.05);
        savings.deposit(200);
        System.out.println("Savings Account Balance: " + savings.getBalance());
        
        
        System.out.println("");
        System.out.println("=============== Exercise 3 ===============");
        // Exercise 3: Creating a Checking Account
        // Create a CheckingAccount instance
        // Perform withdrawal operations with overdraft
        CheckingAccount checking = new CheckingAccount("11111", 300, 150);
        checking.withdraw(400); // within overdraft limit (300 + 150 = 450)
        System.out.println("Checking Account Balance: " + checking.getBalance());
        checking.withdraw(200); // exceeds overdraft limit, should be denied
        
        
        System.out.println("");
        System.out.println("=============== Exercise 4 ===============");
        // Exercise 4: Managing Customer's Accounts
        // Create a BankCustomer instance
        // Add multiple accounts and display total balance
        BankCustomer customer = new BankCustomer("Simon");
        customer.addAccount(new BankAccount("22222", 1000));
        customer.addAccount(new SavingsAccount("33333", 500, 0.05));
        customer.addAccount(new CheckingAccount("44444", 300, 150));
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Balance: " + customer.totalBalance());
        
        
        System.out.println("");
        System.out.println("=============== Exercise 5 ===============");
        // Exercise 5: Transaction History
        // Add transactions to accounts and retrieve history
        BankAccount historyAccount = new BankAccount("55555", 1000);
        historyAccount.deposit(300);
        historyAccount.withdraw(150);
        historyAccount.deposit(200);
        historyAccount.getTransactionHistory();
        
        
        System.out.println("");
        System.out.println("=============== Exercise 6 ===============");
        // Exercise 6: Generate Banking Report
        // Generate and display a customer's banking report
        customer.generateReport();
        
        
        System.out.println("");
        System.out.println("=============== Exercise 7 ===============");
        // Exercise 7: Update Interest Rates
        // Update the interest rate and observe calculations
        System.out.println("TODO");
        
        
        System.out.println("");
        System.out.println("=============== Exercise 8 ===============");
        // Exercise 8: Override Withdrawal Method
        // Demonstrate overridden withdrawal method
        System.out.println("TODO");
        
        
        System.out.println("");
        System.out.println("====== Java OOP Exercises Completed ======");
        // Make sure all exercises are completed and print results
    }
}