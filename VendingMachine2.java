import java.util.Scanner;

public class VendingMachine2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, total = 0;

        System.out.println("===== VENDING MACHINE =====");
        System.out.println("1. Chips  - Rs.20");
        System.out.println("2. Juice  - Rs.30");
        System.out.println("3. Water  - Rs.10");
        System.out.println("4. Chocolate - Rs.20");
        System.out.println("0. Finish");

        do {
            System.out.print("Choose item: ");
            choice = sc.nextInt();

            if (choice == 1) 
                total += 20;
            else if (choice == 2) 
                total += 30;
            else if (choice == 3) 
                total += 10;
            else if (choice == 4) 
                total += 20;
            else if (choice != 0)
                System.out.println("Invalid choice!");

        } while (choice != 0);

        System.out.println("Total = Rs." + total);

        System.out.println("1. Cash");
        System.out.println("2. QR Code");
        System.out.print("Payment method: ");
        int payment = sc.nextInt();

        if (payment == 1) {
            System.out.print("Enter cash: ");
            int cash = sc.nextInt();

            if (cash >= total)
                System.out.println("Change = Rs." + (cash - total));
            else
                System.out.println("Insufficient cash!");
        }
        else if (payment == 2) {
            System.out.println("QR Payment Successful!");
        }

        System.out.println("Thank you!");
        sc.close();
    }
}