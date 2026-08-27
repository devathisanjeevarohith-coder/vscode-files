
class Utility {
    // Accessible without creating an object of 'Utility'
    public static void showInfo(String message) {
        System.out.println("[Utility Log]: " + message);
    }
}

class Account {
    private String accName;
    private double balance;

    public Account(String name, double initialBalance) {
        this.accName = name;
        this.balance = initialBalance;
    }

    class Transaction {
        public void applyFee(double fee) {
            balance -= fee; // Accesses the outer class variable 'balance'
            System.out.println("Fee of $" + fee + " applied to " + accName);
            System.out.println("Remaining Balance: $" + balance);
        }
    }
}

class SimpleAction {
    void execute() {
        // Default behavior (can be empty)
    }
}

public class Bank {
    public static void main(String[] args) {
        
        Utility.showInfo("System is starting up...");

        Account userAccount = new Account("John Doe", 2500.0);
        Account.Transaction action = userAccount.new Transaction();
        action.applyFee(25.0);

        SimpleAction oneTimeTask = new SimpleAction() {
            @Override
            void execute() {
                System.out.println("Performing a one-time cleanup task...");
            }
        };
        oneTimeTask.execute();
    }
}
