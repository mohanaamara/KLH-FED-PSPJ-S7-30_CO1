import java.util.Scanner;

public class VendingMachine1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display menu
        System.out.println("===== VENDING MACHINE =====");
        System.out.println("1. Chips  - Rs.20");
        System.out.println("2. Juice  - Rs.30");
        System.out.println("3. Water  - Rs.10");
        System.out.println("4. Chocolate - Rs.20");

        // Input
        System.out.print("Enter item number: ");
        int item = sc.nextInt();

        System.out.print("Enter amount: Rs.");
        int amount = sc.nextInt();

        // Processing
        int price = 20;
        int change = amount - price;

        // Output
        System.out.println("\n===== BILL =====");
        System.out.println("Selected item number: " + item);
        System.out.println("Item price: Rs." + price);
        System.out.println("Amount entered: Rs." + amount);
        System.out.println("Change: Rs." + change);

        System.out.println("Item dispensed successfully!");
        System.out.println("Thank you!");

        sc.close();
    }
}