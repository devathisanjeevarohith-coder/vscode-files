class MathHelper {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}

class BankAccount {
    private String accHolder = "John Doe";
    private double balance = 1500.0;

    class Transaction {
        public void showDetails() {
            System.out.println("Processing for: " + accHolder);
            System.out.println("Current Balance: $" + balance);
        }
    }
}

abstract class OneTimeAction {
    abstract void start();
}

public class Assignment {
    public static void main(String[] args) {
        
        System.out.println("--- Scenario 1: Utility ---");
        int sum = MathHelper.add(10, 20);
        System.out.println("Sum is: " + sum);
        System.out.println();

        System.out.println("--- Scenario 2: Bank Account ---");
        BankAccount myAcc = new BankAccount();
        BankAccount.Transaction t = myAcc.new Transaction();
        t.showDetails();
        System.out.println();

        System.out.println("--- Scenario 3: One-time Task ---");

        OneTimeAction task = new OneTimeAction() {
            @Override
            void start() {
                System.out.println("Executing a one-time action using an abstract class.");
            }
        };
        task.start();
    }
}
