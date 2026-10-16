import java.util.Scanner;

public class VendingMachine3 {

    static String[] items = {"Chips", "Juice", "Water", "Chocolate"};
    static int[] prices = {20, 30, 10, 20};

    static void displayMenu() {
        System.out.println("===== VENDING MACHINE =====");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] +" - Rs." + prices[i]);
        }
        System.out.println("0. Finish");
    }

    static int getTotal(int choice, int total) {
        return total + prices[choice - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int total = 0;

        displayMenu();

        while (true) {
            System.out.print("Choose item: ");
            choice = sc.nextInt();

            if (choice == 0)
                break;

            if (choice >= 1 && choice <= 4)
                total = getTotal(choice, total);
            else
                System.out.println("Invalid choice!");
        }

        System.out.println("Total = Rs." + total);

        System.out.println("1. Cash");
        System.out.println("2. QR Code");
        System.out.print("Payment: ");
        int payment = sc.nextInt();

        if (payment == 1) {

            System.out.print("Enter cash: ");
            int cash = sc.nextInt();

            if (cash >= total)
                System.out.println("Change = Rs." + (cash - total));
            else
                System.out.println("Insufficient cash!");

        } else if (payment == 2) {

            System.out.println("QR Payment Successful!");

        } else {
            System.out.println("Invalid payment!");
        }

        System.out.println("Thank you!");
        sc.close();
    }
}