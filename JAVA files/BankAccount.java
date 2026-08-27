class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void showAccountDetails() {
        System.out.println("Holder: " + accountHolder + " | Current Balance: $" + balance);
    }

    public class Transaction {
        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount; // Directly accesses private field of Account
                System.out.println("Successfully deposited: $" + amount);
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount; 
                System.out.println("Successfully withdrew: $" + amount);
            } else {
                System.out.println("Transaction failed: Insufficient funds or invalid amount.");
            }
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account myAccount = new Account("John Doe", 500.0);
        myAccount.showAccountDetails();

        Account.Transaction task = myAccount.new Transaction();

        task.deposit(200.0);
        task.withdraw(100.0);

        myAccount.showAccountDetails();
    }
}
