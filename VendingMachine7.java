import java.util.*;
import java.io.*;

class Product {
    String name;
    int price;

    Product(String n, int p) {
        name = n;
        price = p;
    }
}

public class VendingMachine7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // CO1: Input and output
        Product[] p = {
            new Product("Chips", 20),
            new Product("Chocolate", 30),
            new Product("Juice", 40)
        };

        // CO2: Array
        for (int i = 0; i < p.length; i++)
            System.out.println((i + 1) + ". " + p[i].name + " Rs." + p[i].price);

        // CO3: Objects and constructor
        System.out.print("Choose product (1-3): ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 3) {
            Product item = p[choice - 1];

            // CO4: Method-like object data access
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            int bill = item.price * qty;

            // CO5: File handling
            FileWriter f = new FileWriter("bill.txt");
            f.write(item.name + " x " + qty + " = Rs." + bill);
            f.close();

            // CO6: Integrated billing
            System.out.println("Product: " + item.name);
            System.out.println("Total bill: Rs." + bill);
            System.out.println("Bill saved to bill.txt");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}