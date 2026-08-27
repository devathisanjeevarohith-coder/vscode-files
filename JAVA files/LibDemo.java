class Library {
    synchronized void readBook(String user) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(user + " reading chapter " + i);
            try { Thread.sleep(500); } catch (Exception e) { System.out.println(e); }
        }
    }
}
class StudentThread extends Thread {
    Library lib; String name;
    StudentThread(Library lib, String n) { this.lib = lib; this.name = n; }
    public void run() { lib.readBook(name); }
}
public class LibDemo {
    public static void main(String[] args) {
        Library obj = new Library();
        new StudentThread(obj, "Student A").start();
        new StudentThread(obj, "Student B").start();
    }
}