import java.util.*;
import java.io.*;

public class VendingMachine6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collections
        Map<Integer, String> names = new HashMap<>();
        Map<Integer, Integer> prices = new HashMap<>();

        names.put(1, "Chips");
        names.put(2, "Juice");
        names.put(3, "Chocolate");

        prices.put(1, 20);
        prices.put(2, 40);
        prices.put(3, 30);

        try {
            // Lambda expression
            names.forEach((id, name) ->
                System.out.println(id + ". " + name +
                    " - Rs." + prices.get(id)));

            System.out.print("Choose product number: ");
            int choice = sc.nextInt();

            if (!names.containsKey(choice))
                throw new Exception();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            if (qty <= 0)
                throw new Exception();

            int total = prices.get(choice) * qty;

            System.out.println("Product: " + names.get(choice));
            System.out.println("Total Bill: Rs." + total);

            // File handling
            FileWriter fw = new FileWriter("bill.txt", true);
            fw.write(names.get(choice) + " x " + qty +
                     " = Rs." + total + "\n");
            fw.close();

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}