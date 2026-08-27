import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPass = "Secure123";
        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = scanner.nextLine();
            
            if (input.equals(correctPass)) {
                System.out.println("Access Granted!");
                authenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong password. Attempts left: " + (3 - attempts));
            }
        }

        if (!authenticated) {
            System.out.println("ACCOUNT LOCKED. Too many failed attempts.");
        }
    }
}