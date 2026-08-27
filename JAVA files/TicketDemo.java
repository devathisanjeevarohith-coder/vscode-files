class TicketSystem {
    private int ticketId;
    private boolean isBooked = false;

    public synchronized void book(int id) {
        try {
            while (isBooked) { wait(); }
            ticketId = id;
            System.out.println("Booked Ticket ID: " + ticketId);
            isBooked = true;
            notify();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public synchronized void confirm() {
        try {
            while (!isBooked) { wait(); }
            System.out.println("Confirmed Ticket ID: " + ticketId);
            isBooked = false;
            notify();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

class BookingThread extends Thread {
    TicketSystem ts;
    BookingThread(TicketSystem ts) { this.ts = ts; }
    public void run() { for (int i = 1; i <= 5; i++) ts.book(i); }
}

class ConfirmationThread extends Thread {
    TicketSystem ts;
    ConfirmationThread(TicketSystem ts) { this.ts = ts; }
    public void run() { for (int i = 1; i <= 5; i++) ts.confirm(); }
}

public class TicketDemo {
    public static void main(String[] args) {
        TicketSystem obj = new TicketSystem();
        new BookingThread(obj).start();
        new ConfirmationThread(obj).start();
    }
}