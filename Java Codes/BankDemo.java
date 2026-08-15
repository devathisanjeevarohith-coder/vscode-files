class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class BankDemo{
    static void withdraw(double balance, double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
    public static void main(String[] args){
        double balance = 1000.0;
        double amountToWithdraw = 1500.0;
        try {
            withdraw(balance, amountToWithdraw);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}