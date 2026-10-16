import java.util.*;
import java.io.*;

public class VendingMachine5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collections and Generics
        Map<Integer, String> products = new HashMap<>();
        products.put(1, "Chips");
        products.put(2, "Juice");

        Map<Integer, Integer> prices = new HashMap<>();
        prices.put(1, 20);
        prices.put(2, 40);

        try {
            // Lambda Expression
            products.forEach((id, name) ->
                System.out.println(id + ". " + name +
                    " - Rs." + prices.get(id)));

            System.out.print("Choose product number: ");
            int choice = sc.nextInt();

            // Optional
            Optional<Integer> price =
                Optional.ofNullable(prices.get(choice));

            if (price.isPresent()) {
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                if (qty <= 0)
                    throw new IllegalArgumentException("Invalid quantity!");

                int total = price.get() * qty;
                System.out.println("Total Bill: Rs." + total);

                // File I/O
                FileWriter fw = new FileWriter("bill.txt");
                fw.write("Total Bill: Rs." + total);
                fw.close();

            } else {
                System.out.println("Invalid product number!");
            }

            // Stream API
            prices.entrySet().stream()
                .filter(p -> p.getValue() >= 30)
                .forEach(p ->
                    System.out.println("Product number: " + p.getKey()));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}