import java.util.Scanner;

public class RestaurantSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double totalBill = 0.0; // Variable to track the total

        System.out.println("Welcome to the Java Cafe!");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Pizza  - 50.99 Rupees");
            System.out.println("2. Burger - 65.75 Rupees");
            System.out.println("3. Pasta  - 40.39 Rupees");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Added Pizza to order.");
                    totalBill += 50.99;
                    break;
                case 2:
                    System.out.println("Added Burger to order.");
                    totalBill += 65.75;
                    break;
                case 3:
                    System.out.println("Added Pasta to order.");
                    totalBill += 40.39;
                    break;
                case 4:
                    System.out.println("Finalizing your order...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from the menu.");
            }
            
            // Show running total after each selection (optional but helpful)
            if (choice >= 1 && choice <= 3) {
                System.out.println("Current Total: " + totalBill + " Rupees");
            }

        } while (choice != 4);

        System.out.println("---------------------------");
        System.out.println("FINAL BILL: " + totalBill + " Rupees");
        System.out.println("Thank you for dining with us!");
        System.out.println("---------------------------");
    }
}