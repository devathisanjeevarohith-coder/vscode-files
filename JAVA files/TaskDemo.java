class TransactionProcessor implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing Transaction: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { System.out.println(e); }
        }
    }
}
class NotificationSender implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sending Notification: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { System.out.println(e); }
        }
    }
}
public class TaskDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TransactionProcessor());
        Thread t2 = new Thread(new NotificationSender());
        t1.start(); t2.start();
    }
}