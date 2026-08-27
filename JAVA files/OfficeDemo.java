class PrintTask implements Runnable {
    public void run() { for (int i = 1; i <= 5; i++) System.out.println("Printing Page " + i); }
}
class CalcTask implements Runnable {
    public void run() { for (int i = 1; i <= 5; i++) System.out.println("Calculating Row " + i); }
}
public class OfficeDemo {
    public static void main(String[] args) {
        new Thread(new PrintTask()).start();
        new Thread(new CalcTask()).start();
    }
}